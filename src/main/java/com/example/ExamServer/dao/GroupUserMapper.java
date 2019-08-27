package com.example.ExamServer.dao;

import com.example.ExamServer.model.GroupUser;

import java.util.List;

public interface GroupUserMapper {
    int insert(GroupUser record);

    List<GroupUser> selectAll();
}