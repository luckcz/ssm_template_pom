package com.kaicom.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kaicom.dao.UserMapper;
import com.kaicom.pojo.User;
import com.kaicom.service.IUserService;
@Transactional
@Service
public class UserServiceImpl implements IUserService{
	@Resource
	private UserMapper userMapper ;
	@Override
	public String login(String userName, String password) {
		List<User> list_user = userMapper.login(userName, null);
		if(null == list_user || list_user.size() < 1){
			return "用户名不存在";
		}
		List<User> list_login = userMapper.login(userName, password);
		if(null == list_login || list_login.size() < 1){
			return "密码错误";
		}
		return "success";
	}
	@Override
	public String testTran() {
		userMapper.testTransaction1();
		int i = 1/0;
		userMapper.testTransaction2();
		return null;
	}

}
