package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.JSONResult;
import com.example.demo.domain.Resource;

@RestController
public class HelloWorldController {
	@Autowired
	private Resource resource;
	@RequestMapping("/Hello")
	public String Hello() {
		return "Hello World";
	}
	@RequestMapping("/getresource")
	public JSONResult resource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return JSONResult.ok(bean);
	}
}
