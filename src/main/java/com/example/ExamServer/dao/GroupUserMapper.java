package com.example.ExamServer.dao;

import com.example.ExamServer.model.GroupUser;
import com.example.ExamServer.model.entity.GroupUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GroupUserMapper {

    List<GroupUser> selectAll();

    /**
     * 获取组+成员信息
     * @return
     */
    List<GroupUserInfo> selectGroupUserInfo();


    GroupUserInfo selectGroupUserByGid(Integer groupId);

    /**
     * 插入组内成员
     * @param record
     * @return
     */
    int insert(GroupUser record);

}