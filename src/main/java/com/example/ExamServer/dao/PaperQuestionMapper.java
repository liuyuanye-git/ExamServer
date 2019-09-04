package com.example.ExamServer.dao;

import com.example.ExamServer.model.PaperQuestion;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface PaperQuestionMapper {
    int insert(PaperQuestion record);

    List<PaperQuestion> selectAll();
}