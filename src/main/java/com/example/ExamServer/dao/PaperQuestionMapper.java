package com.example.ExamServer.dao;

import com.example.ExamServer.model.PaperQuestion;

import java.util.List;

public interface PaperQuestionMapper {
    int insert(PaperQuestion record);

    List<PaperQuestion> selectAll();
}