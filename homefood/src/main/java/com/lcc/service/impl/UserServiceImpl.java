package com.lcc.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.lcc.dao.UserMapper;
import com.lcc.pojo.User;
import com.lcc.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource  
	private UserMapper userMapper;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(userId);
	}
}
