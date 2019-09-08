package com.example.ExamServer.dao;

import com.example.ExamServer.model.Userinfo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserinfoMapper {
    int deleteByPrimaryKey(Integer id);

    Userinfo selectByPrimaryKey(Integer id);

    List<Userinfo> selectAll();

    int updateByPrimaryKey(Userinfo record);

    /**
     * 设置数据库自增长
     * @return
     */
    int alterUserinfoable();
    /**
     * 添加单个用户
     * @param record
     * @return
     */
    int insert(Userinfo record);

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    Userinfo selectByUsername(String username);


    List<String> selectTest();
}