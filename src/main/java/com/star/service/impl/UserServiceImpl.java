package com.star.service.impl;

import com.star.domain.User;
import com.star.mapper.UserMapper;
import com.star.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2019/11/13 9:30
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser(){
        return  userMapper.getAllUser();
    }

    @Override
    public User getUserById(Integer id){
        return  userMapper.getUserById(id);
    }

    @Override
    public int updateUser(User user){
        return  userMapper.updateUser(user);
    }

    @Override
    public List<User> getUser(User user){
        return  userMapper.getUser(user);
    }

    @Override
    public int addUser(User user){
        return  userMapper.addUser(user);
    }

    @Override
    public int deleteUser(User user){
        return  userMapper.deleteUser(user);
    }
}
