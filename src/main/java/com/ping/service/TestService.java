package com.ping.service;

import java.util.List;

import com.ping.entity.DataObject;
import com.ping.entity.DataObjectAttribute;
import com.ping.entity.Test;

public interface TestService {
	
	public Test query(Integer id);
	
	public Integer insert(Test test);
	
	public List<DataObject> getPltCodes();
	
	public List<DataObjectAttribute> objectAttribute(DataObjectAttribute data);

}
