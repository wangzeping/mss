package com.ping.service;

import com.ping.entity.Test;

public interface TestService {
	
	public Test query(Integer id);
	
	public Integer insert(Test test);

}
