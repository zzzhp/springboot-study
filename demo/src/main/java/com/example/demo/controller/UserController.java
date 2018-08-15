package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.JSONResult;
import com.example.demo.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/getuser")
	public JSONResult getUser() {
		User u = new User();
		u.setName("张三");
		u.setPassword("123");
		u.setAge(19);
		u.setBirthday(new Date());
		u.setDesc("大帅比");
		return JSONResult.ok(u);
	}
}
