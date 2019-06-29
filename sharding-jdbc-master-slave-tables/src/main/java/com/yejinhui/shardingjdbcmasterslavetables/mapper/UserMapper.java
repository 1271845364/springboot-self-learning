package com.yejinhui.shardingjdbcmasterslavetables.mapper;


import com.yejinhui.shardingjdbcmasterslavetables.entity.User;

import java.util.List;

public interface UserMapper {

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    List<User> list();
}