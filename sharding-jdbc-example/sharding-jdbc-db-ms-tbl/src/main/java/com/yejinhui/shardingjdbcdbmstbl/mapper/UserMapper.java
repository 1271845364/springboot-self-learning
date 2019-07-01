package com.yejinhui.shardingjdbcdbmstbl.mapper;



import com.yejinhui.shardingjdbcdbmstbl.entity.User;

import java.util.List;

public interface UserMapper {

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    List<User> list();
}