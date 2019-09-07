package com.example.ExamServer.service.Impl;

import com.example.ExamServer.dao.GroupUserMapper;
import com.example.ExamServer.model.GroupUser;
import com.example.ExamServer.model.entity.GroupUserInfo;
import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IGroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by twinkleStar on 2019/9/3.
 */
@Repository
public class GroupUserServiceImpl implements IGroupUserService {

    @Autowired
    GroupUserMapper groupUserMapper;

    /**
     * 获取组+成员信息
     * @return
     */
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



    public ResponseEntity addNewGroupUser(Map<String,Object> map){
        ResponseEntity responseEntity=new ResponseEntity();

        int groupId=Integer.parseInt(String.valueOf(map.get("group_id")));

        ArrayList<Integer> stuObj=(ArrayList<Integer>)map.get("student_id");
        int length = stuObj.size();

        int[] studentIds=new int[length];

        GroupUser groupUser=new GroupUser();
        groupUser.setGroupId(groupId);

        int flag=0;

        String resStr="未添加成功的groupId为"+groupId+",未添加成功的studentID见data返回值";
        ArrayList<Integer> resId=new ArrayList<Integer>();
        for(int i=0;i<length;i++){
            studentIds[i]=stuObj.get(i);
            groupUser.setUserId(studentIds[i]);
            int res=groupUserMapper.insert(groupUser);
            if(res<0){
                flag++;
                resId.add(studentIds[1]);
            }
        }

        if(flag==0){
            responseEntity.setStatus(200);
            responseEntity.setMsg("添加成功");
        }else{
            responseEntity.setMsg(resStr);
            responseEntity.setStatus(-1);
            responseEntity.setData(resId);
        }

        return responseEntity;
    }


    public ResponseEntity  getGroupUserByGid(int groupId){
        GroupUserInfo groupUserInfo=groupUserMapper.selectGroupUserByGid(groupId);
        ResponseEntity responseEntity=new ResponseEntity();
        if(groupUserInfo==null){
            responseEntity.setStatus(-1);
            responseEntity.setMsg("组不存在");
        }else {
            responseEntity.setStatus(200);
            responseEntity.setMsg("查询成功");
            responseEntity.setData(groupUserInfo);
        }

        return responseEntity;
    }


}
