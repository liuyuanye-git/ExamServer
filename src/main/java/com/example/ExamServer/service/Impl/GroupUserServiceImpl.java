package com.example.ExamServer.service.Impl;

import com.example.ExamServer.dao.GroupUserMapper;
import com.example.ExamServer.model.entity.GroupUserInfo;
import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IGroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by twinkleStar on 2019/9/3.
 */
@Repository
public class GroupUserServiceImpl implements IGroupUserService {


    @Autowired
    GroupUserMapper groupUserMapper;


    public ResponseEntity getGroupUserInfo(){
        List<GroupUserInfo> groupUserInfoList=groupUserMapper.selectGroupUserInfo();
        ResponseEntity responseEntity=new ResponseEntity();
        if(groupUserInfoList==null || groupUserInfoList.size()==0){
            responseEntity.setStatus(-1);
            responseEntity.setMsg("组不存在");
        }else {
            responseEntity.setStatus(200);
            responseEntity.setMsg("查询成功");
            responseEntity.setData(groupUserInfoList);
        }

        return responseEntity;
    }
}
