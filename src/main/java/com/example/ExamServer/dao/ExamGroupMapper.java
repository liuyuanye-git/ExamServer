package com.example.ExamServer.dao;

import com.example.ExamServer.model.ExamGroup;

import java.util.List;

public interface ExamGroupMapper {
    int insert(ExamGroup record);

    List<ExamGroup> selectAll();
}