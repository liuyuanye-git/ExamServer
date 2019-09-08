package com.example.ExamServer.service.Impl;

import com.example.ExamServer.dao.UserinfoMapper;
import com.example.ExamServer.model.Userinfo;
import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by twinkleStar on 2019/8/26.
 */
@Repository
public class UserinfoServiceImpl implements IUserinfoService {

    @Autowired
    UserinfoMapper userinfoMapper;

    /**
     * 添加单个用户
     * @param
     * @return
     */
    public ResponseEntity addNewUsers(String[] name, int[] password){

        ResponseEntity responseEntity=new ResponseEntity();
        int res=0;
        for(int i=0;i<name.length;i++){
            Userinfo userinfo=new Userinfo();
            userinfo.setUserType("student");
            userinfo.setUserName(name[i]);
            userinfo.setPassword(password[i]+"");
            Userinfo user=userinfoMapper.selectByUsername(userinfo.getUserName());
            if(user!=null){
                responseEntity.setStatus(-1);
                responseEntity.setMsg("该用户已存在");
                return responseEntity;
            }else{
                 res=userinfoMapper.insert(userinfo);

                if(res<0){
                    responseEntity.setStatus(-1);
                    responseEntity.setMsg("添加失败");
                    return responseEntity;
                }else{
                    responseEntity.setStatus(200);
                    responseEntity.setMsg("添加成功");
                }
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
     * 获取所有考生用户列表
     */
    public ResponseEntity selectAllStudent() {
        List<Userinfo> StudentList = (List<Userinfo>) userinfoMapper.selectAllStudent();
        ResponseEntity responseEntity = new ResponseEntity();
        if(StudentList == null || StudentList.size() ==0) {
            responseEntity.setStatus(-1);
            responseEntity.setMsg("没有考生信息");
        } else {
            responseEntity.setStatus(200);
            responseEntity.setMsg("查询成功");
            responseEntity.setData(StudentList);
        }

        return  responseEntity;
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
