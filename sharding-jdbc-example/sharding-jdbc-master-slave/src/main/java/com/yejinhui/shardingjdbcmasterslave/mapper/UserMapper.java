package com.yejinhui.shardingjdbcmasterslave.mapper;


import com.yejinhui.shardingjdbcmasterslave.entity.User;

import java.util.List;

public interface UserMapper {

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    List<User> list();
}