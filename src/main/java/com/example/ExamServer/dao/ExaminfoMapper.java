package com.example.ExamServer.dao;

import com.example.ExamServer.model.Examinfo;

import java.util.List;

public interface ExaminfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Examinfo record);

    Examinfo selectByPrimaryKey(Integer id);

    List<Examinfo> selectAll();

    int updateByPrimaryKey(Examinfo record);
}