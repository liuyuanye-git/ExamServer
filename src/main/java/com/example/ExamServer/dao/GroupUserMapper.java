package com.example.ExamServer.dao;

import com.example.ExamServer.model.GroupUser;
import com.example.ExamServer.model.entity.GroupUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface GroupUserMapper {
    int insert(GroupUser record);

    List<GroupUser> selectAll();

    List<GroupUserInfo> selectGroupUserInfo();
}