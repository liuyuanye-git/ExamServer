package com.example.ExamServer.dao;

import com.example.ExamServer.model.Questioninfo;

import java.util.List;

public interface QuestioninfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Questioninfo record);

    Questioninfo selectByPrimaryKey(Integer id);

    List<Questioninfo> selectAll();

    int updateByPrimaryKey(Questioninfo record);
}