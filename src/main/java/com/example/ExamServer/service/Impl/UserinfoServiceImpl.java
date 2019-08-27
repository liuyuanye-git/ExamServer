package com.example.ExamServer.service.Impl;

import com.example.ExamServer.dao.UserinfoMapper;
import com.example.ExamServer.model.Userinfo;
import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by twinkleStar on 2019/8/26.
 */
@Repository
public class UserinfoServiceImpl implements IUserinfoService {

    @Autowired
    UserinfoMapper userinfoMapper;

    /**
     * 添加单个用户
     * @param userinfo
     * @return
     */
    public ResponseEntity addNewUser(Userinfo userinfo){
        ResponseEntity responseEntity=new ResponseEntity();
        Userinfo user=userinfoMapper.selectByUsername(userinfo.getUserName());
        if(user!=null){
            responseEntity.setStatus(-1);
            responseEntity.setMsg("该用户已存在");
        }else{
            int res=userinfoMapper.insert(userinfo);
            if(res<0){
                responseEntity.setStatus(-1);
                responseEntity.setMsg("添加失败");
            }else{
                responseEntity.setStatus(200);
                responseEntity.setMsg("添加成功");
            }
        }

        return responseEntity;
    }


    /**
     * 查询用户
     * @param username
     * @param password
     * @return
     */
    public ResponseEntity selectUser(String username,String password){
        Userinfo userinfo=userinfoMapper.selectByUsername(username);
        ResponseEntity responseEntity=new ResponseEntity();
        if(userinfo==null){
            responseEntity.setStatus(-1);
            responseEntity.setMsg("该用户不存在");
        }else if(!password.equals(userinfo.getPassword())){
            responseEntity.setStatus(-1);
            responseEntity.setMsg("用户名或密码错误");
        }else{
            responseEntity.setStatus(200);
            responseEntity.setMsg("查询成功");
            responseEntity.setData(userinfo);
        }
        return responseEntity;
    }




    /**
     * 仅测试
     * @param username
     * @param password
     * @return
     */
    public String selectUserTest(String username,String password){

        return "valid";
    }
}
