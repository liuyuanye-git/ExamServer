package com.example.ExamServer.controller;

import com.example.ExamServer.dao.UserinfoMapper;
import com.example.ExamServer.model.Userinfo;
import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IUserinfoService;

import org.apache.poi.ss.usermodel.*;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by twinkleStar on 2019/8/26.
 */
@RestController
@RequestMapping("/userinfo")
public class UserinfoController {

    @Autowired
    IUserinfoService iUserinfoService;

    /**
     * 单个用户注册
     * @param userinfo
     * @return
     */
//    @PostMapping
//    public ResponseEntity addSingleUser(@RequestBody Userinfo userinfo) {
//        ResponseEntity responseEntity=iUserinfoService.addNewUser(userinfo);
//        return responseEntity;
//    }


    /**
     * 用户登陆
     * 参数：user_name,password
     * @param map
     * @return
     */
    @PostMapping("/login")
    public ResponseEntity userLogin(@RequestBody Map<String,String> map) {
        ResponseEntity responseEntity = iUserinfoService.selectUser(map.get("user_name"), map.get("password"));
        return responseEntity;
    }


    @PostMapping(value = "/newstu")
    @Transactional
    public ResponseEntity addNewStudent(
            @RequestParam( value="files[]",required=false)MultipartFile[] multipartFiles)throws IllegalStateException, IOException {

        ResponseEntity responseEntity=new ResponseEntity();
        MultipartFile file=multipartFiles[0];
        InputStream inputStream = file.getInputStream();

        try{
            Workbook wb = WorkbookFactory.create(inputStream);
            Sheet sheet = wb.getSheetAt(0);

            int maxRowNum = sheet.getPhysicalNumberOfRows();

            String[] name=new String[maxRowNum-2];
            int[] password=new int[maxRowNum-2];
            for(int i=2;i<maxRowNum;i++){
                Row row=sheet.getRow(i);
                Cell nameCell=row.getCell(0);
                Cell passwordCell= row.getCell(1);

                if(nameCell.getCellTypeEnum().equals(CellType.STRING)){
                    name[i-2]=nameCell.getStringCellValue();
                }else{
                    responseEntity.setStatus(-1);
                    responseEntity.setMsg("姓名列不得为数字");
                    return responseEntity;
                }

                if(passwordCell.getCellTypeEnum().equals(CellType.NUMERIC)){
                    password[i-2]=(int)passwordCell.getNumericCellValue();
                }else{
                    responseEntity.setStatus(-1);
                    responseEntity.setMsg("身份证号列必须为数字");
                    return responseEntity;
                }

            }
            responseEntity=iUserinfoService.addNewUsers(name,password);

        }catch (Exception e) {

        }
        return responseEntity;

    }




    @PostMapping("/check-student")
    public ResponseEntity checkStudent() {
        ResponseEntity responseEntity = iUserinfoService.selectAllStudent();
        return responseEntity;
    }
}
