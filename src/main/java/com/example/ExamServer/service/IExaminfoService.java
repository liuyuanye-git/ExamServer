package com.example.ExamServer.service;

import com.example.ExamServer.model.entity.ResponseEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by xusysh on 2019/9/2.
 */
public interface IExaminfoService {
    /**
     * 根据用户名查询其所在考试
     * @param username
     * @return
     */
    ResponseEntity checkUserExam(String username);
}
