package com.example.ExamServer.dao;

import com.example.ExamServer.model.ExamGroup;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ExamGroupMapper {
    int insert(ExamGroup record);

    List<ExamGroup> selectAll();
}