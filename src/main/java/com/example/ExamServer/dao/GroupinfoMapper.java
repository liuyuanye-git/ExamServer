package com.example.ExamServer.dao;

import com.example.ExamServer.model.Groupinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface GroupinfoMapper {
    int deleteByPrimaryKey(Integer id);


    Groupinfo selectByPrimaryKey(Integer id);

    List<Groupinfo> selectAll();

    int updateByPrimaryKey(Groupinfo record);


    /**
     * 插入组信息
     * @param record
     * @return
     */
    int insert(Groupinfo record);

    Groupinfo selectByGroupName(String groupName);

}