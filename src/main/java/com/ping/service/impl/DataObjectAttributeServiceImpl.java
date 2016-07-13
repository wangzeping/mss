package com.ping.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ping.dao.DataObjectAttributeDao;
import com.ping.entity.DataObjectAttribute;
import com.ping.service.DataObjectAttributeService;
import com.ping.util.result.PageResult;

@Service
public class DataObjectAttributeServiceImpl extends BaseServiceImpl<DataObjectAttributeDao, DataObjectAttribute> implements DataObjectAttributeService {
	
	public DataObjectAttribute getEntity(DataObjectAttribute data){
		return super.get(data);
	}

	public List<DataObjectAttribute> objectAttribute(DataObjectAttribute data) {
		return null;
	}
	
	public List<DataObjectAttribute> findListEntity(DataObjectAttribute data){
		return super.findList(data);
	}

	public PageResult<DataObjectAttribute> findListPage(PageResult<DataObjectAttribute> page, DataObjectAttribute data) {
		return super.findPage(page, data);
	}

}
