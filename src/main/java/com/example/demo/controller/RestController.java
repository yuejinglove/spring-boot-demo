/**
 * @Title: RestController.java
 * @Package com.example.demo.controller
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-21 16:14
 * @version V1.0
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

/**
 * @ClassName: RestController
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-21 16:14
 */
@Controller
@RequestMapping("/api/v1")
public class RestController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/user.do", method=RequestMethod.POST)
	public @ResponseBody User getUser() {
		return userService.getUserById(1);
	}
	
	@RequestMapping(value="/get/{id}.do", method=RequestMethod.POST)
	public @ResponseBody User getById(@PathVariable("id") Integer id) {
		return userService.getUserById(id);
	}
}
