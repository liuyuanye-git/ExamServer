package com.example.ExamServer.dao;

import com.example.ExamServer.model.Groupinfo;

import java.util.List;

public interface GroupinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Groupinfo record);

    Groupinfo selectByPrimaryKey(Integer id);

    List<Groupinfo> selectAll();

    int updateByPrimaryKey(Groupinfo record);
}