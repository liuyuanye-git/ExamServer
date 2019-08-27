package com.example.ExamServer.dao;

import com.example.ExamServer.model.PaperUser;

import java.util.List;

public interface PaperUserMapper {
    int insert(PaperUser record);

    List<PaperUser> selectAll();
}