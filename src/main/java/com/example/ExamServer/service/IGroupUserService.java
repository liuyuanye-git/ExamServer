package com.example.ExamServer.service;

import com.example.ExamServer.model.entity.GroupUserInfo;
import com.example.ExamServer.model.entity.ResponseEntity;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    ResponseEntity addNewGroupUser(Map<String,Object> map);

    ResponseEntity getGroupUserByGid(int groupId);
}
