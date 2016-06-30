package com.ping.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ping.entity.Test;
import com.ping.service.TestService;

@Controller
@RequestMapping("/test")
public class Hello {
	
	@Autowired
	private TestService testService;
	
//	@RequestMapping(value="/hello",produces = "plain/text; charset=UTF-8")
	@RequestMapping("/hello")
	@ResponseBody
	public Object hello(){
		
		Test test = new Test();
		test.setId(6);
		test.setName("‘Û∆Ω");
		return testService.query(6);
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public Object insert(Integer id,String name){
		Test test = new Test();
		test.setId(id);
		test.setName(name);
		return testService.insert(test);
	}

}

