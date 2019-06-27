package com.jt.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jt.pojo.User;

public interface UserMapper extends BaseMapper<User>{
	/**
	 * 查询全部的user表中的数据
	 * @return
	 */
	List<User> findAll();
	/**
	 * 规定:Mybatis中要求数据传参必须是单值
	 * 方案:
	 * 1.封装,利用对象将数据封装
	 * 2.将数据封装为map集合
	 * 3.将数据封装为array/list集合
	 * @param user
	 * @return
	 */
	int insertUser(User user);
}
