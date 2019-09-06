package com.example.ExamServer.dao;

import com.example.ExamServer.model.Examinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ExaminfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Examinfo record);

    Examinfo selectByPrimaryKey(Integer id);

    Examinfo getExambyUser(Integer userId);

    List<Examinfo> selectAll();

    int updateByPrimaryKey(Examinfo record);
}