package com.example.ExamServer.service.Impl;

import com.example.ExamServer.dao.ExaminfoMapper;
import com.example.ExamServer.dao.ExamGroupMapper;
import com.example.ExamServer.dao.GroupUserMapper;
import com.example.ExamServer.dao.UserinfoMapper;
import com.example.ExamServer.model.Examinfo;
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
        Userinfo user=userinfoMapper.selectByUsername(userinfo.getUserName());
        if(user!=null){
            responseEntity.setStatus(-1);
            responseEntity.setMsg("该用户已存在");
        }else{
            int res=userinfoMapper.insert(userinfo);
            if(res<0){
                responseEntity.setStatus(-1);
                responseEntity.setMsg("添加失败");
            }else{
                responseEntity.setStatus(200);
                responseEntity.setMsg("添加成功");
            }
        }
        return responseEntity;
    }
}
