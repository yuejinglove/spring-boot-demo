/**
 * @Title: UserServiceImpl.java
 * @Package com.example.demo.service.impl
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-22 10:05
 * @version V1.0
 */
package com.example.demo.service.impl;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-22 10:05
 */
public class UserServiceImpl implements UserService {

	/*
	 * @param id
	 * @return
	 * @see com.example.demo.service.UserService#getUserById(java.lang.Integer)
	 */

	@Override
	public User getUserById(Integer id) {
		
		return new User(id, "kang", 22);
	}

}
