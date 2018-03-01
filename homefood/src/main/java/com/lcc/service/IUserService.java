package com.lcc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lcc.pojo.User;

public interface IUserService {
	@Autowired
	public User getUserById(int userId);

}
