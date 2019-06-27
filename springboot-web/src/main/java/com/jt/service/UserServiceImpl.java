package com.jt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	//接口实例化:1.创建实现类 2.创建代理对象JDK
	//代理要求:
	//JDK要求必须有接口 cglib有无接口都能创建代理对象
	//原则:如果代理对象有接口,则使用JDK代理
	//  如果代理对象没有接口,则使用cglib代理
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() {
		
		return userMapper.findAll();
	}

	@Override
	public int insertUser(User user) {
		return userMapper.insertUser(user);
	}
	
	
}
