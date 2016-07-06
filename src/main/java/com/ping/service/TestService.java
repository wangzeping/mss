package com.ping.service;

import java.util.List;

import com.ping.entity.DataObject;
import com.ping.entity.DataObjectAttribute;
import com.ping.entity.Test;
import com.ping.util.result.PageResult;

public interface TestService {
	
	public Test query(Integer id);
	
	public Integer insert(Test test);
	
	public List<DataObject> getPltCodes();
	
	public List<DataObjectAttribute> objectAttribute(DataObjectAttribute data);
	
	//public PageResult<DataObjectAttribute> objectAttribute(PageResult<DataObjectAttribute> page);

}
