package com.ping.service;

import java.util.List;

import com.ping.entity.DataObjectAttribute;
import com.ping.util.result.PageResult;

public interface DataObjectAttributeService {
	
	public List<DataObjectAttribute> objectAttribute(DataObjectAttribute data);
	
	public DataObjectAttribute getEntity(DataObjectAttribute data);
	
	public List<DataObjectAttribute> findListEntity(DataObjectAttribute data);
	
	public PageResult<DataObjectAttribute> findListPage(PageResult<DataObjectAttribute> page,DataObjectAttribute data);

}
