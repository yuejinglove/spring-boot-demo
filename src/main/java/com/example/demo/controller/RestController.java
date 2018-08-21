/**
 * @Title: RestController.java
 * @Package com.example.demo.controller
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-21 16:14
 * @version V1.0
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.User;

/**
 * @ClassName: RestController
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-21 16:14
 */
@Controller
@RequestMapping("/api/v1")
public class RestController {
	@RequestMapping(value="/user.do", method=RequestMethod.POST)
	public @ResponseBody User getUser() {
		return new User(1L, "test", 12);
	}
	
	@RequestMapping(value="/get/{id}.do", method=RequestMethod.POST)
	public @ResponseBody User getById(@PathVariable("id") Long id) {
		return new User(id, "test", 17);
	}
}
