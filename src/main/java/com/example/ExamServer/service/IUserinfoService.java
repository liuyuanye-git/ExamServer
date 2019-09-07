package com.example.ExamServer.service;

import com.example.ExamServer.model.Userinfo;
import com.example.ExamServer.model.entity.ResponseEntity;

/**
 * Created by twinkleStar on 2019/8/26.
 */
public interface IUserinfoService {

    /**
     * 添加单个用户
     * @param userinfo
     * @return
     */
    ResponseEntity addNewUser(Userinfo userinfo);

    /**
     * 根据用户名、密码查询单个用户
     * @param username
     * @param password
     * @return
     */
    ResponseEntity selectUser(String username, String password);

    /**
     * 仅测试
     * @param username
     * @param password
     * @return
     */
    String selectUserTest(String username, String password);

    /**
     * 获取所有考生列表
     */
    ResponseEntity selectAllStudent();
}
