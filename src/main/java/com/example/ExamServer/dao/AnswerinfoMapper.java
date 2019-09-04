package com.example.ExamServer.dao;

import com.example.ExamServer.model.Answerinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AnswerinfoMapper {
    int insert(Answerinfo record);

    List<Answerinfo> selectAll();
}