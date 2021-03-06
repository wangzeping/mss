package com.ping.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ping.entity.DataObjectAttribute;
import com.ping.entity.Test;
import com.ping.service.DataObjectAttributeService;
import com.ping.service.TestService;
import com.ping.util.result.PageResult;

@Controller
@RequestMapping("/test")
public class Hello {
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private DataObjectAttributeService dataObjectAttributeService;
	
//	@RequestMapping(value="/hello",produces = "plain/text; charset=UTF-8")
	@RequestMapping("/hello")
	@ResponseBody
	public Object hello(){
		
		Test test = new Test();
		test.setId(6);
		test.setName("��ƽ");
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
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	
	@RequestMapping("/json")
	@ResponseBody
	public Object json(String name){
		String msg = "���";
		return msg;
	}
	
	@RequestMapping("/getPltCode")
	@ResponseBody
	public Object getPltCode(HttpServletRequest request,String name,String password,Integer age){
		name = request.getParameter("name");
		return testService.getPltCodes();
	}
	
	@RequestMapping("/onePltDatas")
	@ResponseBody
	public Object onePltDatas(HttpServletRequest request,DataObjectAttribute data){
		data.setPageNo(1);
		data.setPageSize(15);
		//return testService.objectAttribute(data);
		new PageResult<DataObjectAttribute>();
		
		
		return dataObjectAttributeService.findListEntity(data);
	}

}

