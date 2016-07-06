package com.ping.dao;

import com.ping.entity.Test;

public interface TestDao {
	
	public Test queryById(Integer id);
	
	public Integer insert(Test test);
	

}
