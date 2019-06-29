package com.yejinhui.shardingjdbcmasterslave.service;

import com.yejinhui.shardingjdbcmasterslave.entity.User;
import com.yejinhui.shardingjdbcmasterslave.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinhui.ye@ucarinc.com
 * @date 2019/06/29
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> list() {
        return userMapper.list();
    }

    public void addUser(User user) {
        userMapper.insertSelective(user);
    }
}