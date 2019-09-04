package com.example.ExamServer.dao;

import com.example.ExamServer.model.Questioninfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface QuestioninfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Questioninfo record);

    Questioninfo selectByPrimaryKey(Integer id);

    List<Questioninfo> selectAll();

    int updateByPrimaryKey(Questioninfo record);
}