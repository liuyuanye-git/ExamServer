package com.example.ExamServer.dao;

import com.example.ExamServer.model.Answerinfo;

import java.util.List;

public interface AnswerinfoMapper {
    int insert(Answerinfo record);

    List<Answerinfo> selectAll();
}