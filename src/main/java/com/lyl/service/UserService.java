package com.lyl.service;

import com.lyl.mapper.UserMapper;
import com.lyl.model.User;
import com.lyl.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 2016/10/8.
 */
@Service
public class UserService implements UserServiceImpl {
    @Autowired
  private   UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {

        return userMapper.selectByPrimaryKey(id);
    }
}
