/**
 * @Title: TestController.java
 * @Package com.example.demo.controller
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-21 15:18
 * @version V1.0
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: TestController
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-21 15:18
 */
@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping("/index.html")
	public String defIndex(Model model) {
		model.addAttribute("name", "hello,");
		return "/index.html";
	}
}
