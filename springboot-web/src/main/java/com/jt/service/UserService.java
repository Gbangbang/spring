package com.jt.service;

import java.util.List;

import com.jt.pojo.User;

public interface UserService {
	public List<User> findAll();

	public int insertUser(User user);
}
