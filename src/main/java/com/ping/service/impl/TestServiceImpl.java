package com.ping.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ping.dao.TestDao;
import com.ping.entity.Test;
import com.ping.service.TestService;

@Service("userService")
public class TestServiceImpl implements TestService{

	@Resource
	private TestDao testDao;
	
	public Test query(Integer id) {
		Test test = testDao.queryById(id);
		System.out.println(test.getId()+","+test.getName());
		return test;
	}
	
	public Integer insert(Test test){
		Integer count = testDao.insert(test);
		if(2>1){
			throw new RuntimeException();
		}
		return count;
	}

}
