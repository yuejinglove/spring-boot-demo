/**
 * @Title: HttpParamController.java
 * @Package com.example.demo.controller
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-22 09:29
 * @version V1.0
 */
package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.OrderPostForm;
import com.example.demo.pojo.User;

/**
 * @ClassName: HttpParamController
 * @Description: 使用JavaBean接收HTTP参数
 * @author ZhengYH
 * @date 2018-08-22 09:29
 */
@Controller
@RequestMapping("/api/v1")
public class HttpParamController {
	
	Logger LOGGER = LoggerFactory.getLogger(HttpParamController.class);
	
	/**
	 * @Title: getUser2
	 * @author ZhengYH
	 * @Description: 使用参数逐个接收
	 * @param id
	 * @param name
	 * @return
	 * @test : 127.0.0.1:8010/api/v1/get/user1.do?id=1&name=mingli
	 */
	@RequestMapping("/get/user1.do")
	@ResponseBody
	public String getUser2(Integer id, String name) {
		LOGGER.debug("\n{\n \"id\" : \"" + id + "\", \n \"name\" : \"" + name + "\"\n}");
		if(id == null) {
			return "FAILER";
		}
		return "SUCCESS";
	}
	/**
	 * @Title: getUser3
	 * @author ZhengYH
	 * @Description: 使用JavaBean接收
	 * @param user
	 * @return
	 * @test : 127.0.0.1:8010/api/v1/get/user1.do?id=1&name=mingli
	 */
	@RequestMapping("/get/user2.do")
	@ResponseBody
	public String getUser3(User user) {
		LOGGER.debug(user.toString());
		return "SUCCESS";
	}
	
	/**
	 * @Title: saveOrder
	 * @author ZhengYH
	 * @Description: 
	 * @param form :HTTP请求参数必须 有order.id, order.name 才可以给form的属性order赋值
	 * @return
	 * @test : 127.0.0.1:8010/api/v1/save/order.do?order.id=a123b&order.name=haha
	 */
	@ResponseBody
	@RequestMapping("/save/order.do")
	public String saveOrder(OrderPostForm form) {
		LOGGER.debug(form.toString());
		
		return "SUCCESS";
	}
	
	
}
