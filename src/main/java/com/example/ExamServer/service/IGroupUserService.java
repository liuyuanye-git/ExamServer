package com.example.ExamServer.service;

import com.example.ExamServer.model.entity.GroupUserInfo;
import com.example.ExamServer.model.entity.ResponseEntity;

import java.util.List;

/**
 * Created by twinkleStar on 2019/9/3.
 */
public interface IGroupUserService {

    /**
     * 获取组-用户列表
     * todo:组加上admin用户ID
     * @return
     */
    ResponseEntity getGroupUserInfo();

}
