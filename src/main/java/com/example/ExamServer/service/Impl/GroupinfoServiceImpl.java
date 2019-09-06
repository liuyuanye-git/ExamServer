package com.example.ExamServer.service.Impl;

import com.example.ExamServer.dao.GroupinfoMapper;
import com.example.ExamServer.model.Groupinfo;
import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IGroupinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by twinkleStar on 2019/9/4.
 */

@Repository
public class GroupinfoServiceImpl implements IGroupinfoService {


    @Autowired
    GroupinfoMapper groupinfoMapper;

    public ResponseEntity addGroupinfo(Groupinfo groupinfo){
        ResponseEntity responseEntity=new ResponseEntity();
        Groupinfo infoAlready=groupinfoMapper.selectByGroupName(groupinfo.getGroupName());
        if(infoAlready!=null){
            responseEntity.setStatus(-1);
            responseEntity.setMsg("组已存在,组名不可重复");
            return responseEntity;
        }else{
            int res=groupinfoMapper.insert(groupinfo);

            if(res<0){
                responseEntity.setStatus(-1);
                responseEntity.setMsg("添加失败");

            }else{
                responseEntity.setStatus(200);
                responseEntity.setMsg("添加组成功");
                responseEntity.setData(groupinfo);
            }

            return responseEntity;
        }

    }
}
