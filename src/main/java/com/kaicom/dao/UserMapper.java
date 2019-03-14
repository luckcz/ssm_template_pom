package com.kaicom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kaicom.pojo.User;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> login(@Param("userName") String userName, @Param("password") String password);
    
    int testTransaction1();
    int testTransaction2();
}