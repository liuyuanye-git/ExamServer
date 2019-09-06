package com.example.ExamServer.service.Impl;

import com.example.ExamServer.dao.*;
import com.example.ExamServer.model.Examinfo;
import com.example.ExamServer.model.Groupinfo;
import com.example.ExamServer.model.Userinfo;
import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IExaminfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by xusysh on 2019/9/2.
 */
@Repository
public class ExaminfoServiceImpl implements IExaminfoService {
    @Autowired
    ExaminfoMapper examinfoMapper;

    @Autowired
    ExamGroupMapper examGroupMapper;

    @Autowired
    GroupUserMapper groupUserMapper;

    /**
     * 根据用户名查询其所在考试
     *
     * @param username
     * @return
     */
    @Override
    public ResponseEntity checkUserExam(String username) {
        ResponseEntity responseEntity=new ResponseEntity();
        return responseEntity;
    }


    public ResponseEntity userCheckExam(int userId) {
        ResponseEntity responseEntity = new ResponseEntity();
        Examinfo examinfo = examinfoMapper.getExambyUser(userId);
        responseEntity.setData(examinfo);
        responseEntity.setMsg("查询成功");
        responseEntity.setStatus(200);
        return  responseEntity;
    }
}
