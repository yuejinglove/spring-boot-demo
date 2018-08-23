/**
 * @Title: UserService.java
 * @Package com.example.demo.service
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-22 10:01
 * @version V1.0
 */
package com.example.demo.service;

import com.example.demo.pojo.User;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-22 10:01
 */
public interface UserService {
	/**
	 * @Title: getUserById
	 * @author ZhengYH
	 */
	public User getUserById(Integer id);
}
