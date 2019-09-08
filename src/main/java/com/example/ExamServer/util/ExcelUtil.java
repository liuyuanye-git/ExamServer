package com.example.ExamServer.util;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by twinkleStar on 2019/9/8.
 */
@Component
public class ExcelUtil {

    public HSSFWorkbook addUsersTemplate(){

        HSSFWorkbook   wb = new HSSFWorkbook();

        HSSFSheet sheet = wb.createSheet("添加用户excel模板");

        HSSFRow row1 = sheet.createRow(0);
        HSSFCellStyle style1 = wb.createCellStyle();
        style1.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        style1.setFillForegroundColor(IndexedColors.YELLOW.getIndex());// 设置背景色
        style1.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        HSSFCell cell1 = null;
        for(int i=0;i<2;i++){
            cell1 = row1.createCell(i);
            cell1.setCellValue("在线考试系统用户导入模板");
            cell1.setCellStyle(style1);
        }
        CellRangeAddress region1 = new CellRangeAddress(0, 0, 0, 1);
        sheet.addMergedRegion(region1);

        style1.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
        style1.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
        style1.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
        style1.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框



        HSSFRow row2 = sheet.createRow(1);
        HSSFCellStyle style2 = wb.createCellStyle();
        style2.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        style2.setFillForegroundColor(IndexedColors.YELLOW.getIndex());// 设置背景色
        style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style2.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
        style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
        style2.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
        style2.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框


        HSSFCell cell2 = null;

        for(int i=0;i<2;i++){
            cell2 = row2.createCell(i);
            cell2.setCellValue("请勿修改黄色区域表格，所有单元格应为文本格式");
            cell2.setCellStyle(style2);
        }
        CellRangeAddress region2 = new CellRangeAddress(1, 1, 0, 1);
        sheet.addMergedRegion(region2);

        HSSFRow row3 = sheet.createRow(2);
        HSSFCellStyle style3 = wb.createCellStyle();
        style3.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        style3.setFillForegroundColor(IndexedColors.YELLOW.getIndex());// 设置背景色
        style3.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style3.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
        style3.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
        style3.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
        style3.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框

        HSSFCell cell3 = null;

        cell3 = row3.createCell(0);
        cell3.setCellValue("姓名");
        cell3.setCellStyle(style3);
        cell3 = row3.createCell(1);
        cell3.setCellValue("身份证号");
        cell3.setCellStyle(style3);


        sheet.setColumnWidth(0, 60 * 128);  //设置列宽，20个字符宽
        sheet.setColumnWidth(1, 60 * 128);
        return wb;
    }
}
