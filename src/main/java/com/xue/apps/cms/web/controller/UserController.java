package com.xue.apps.cms.web.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xue.apps.cms.utils.Message;

@Validated
@RestController//加这个注解，就会往前端返回json格式的数据
@RequestMapping("/user")
public class UserController {

	@PostMapping("login")
	public Message login(
			@RequestBody String username,
			@RequestBody String password) {
		
		return null;
	}
	
}
