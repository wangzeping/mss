package com.ping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ping.dao.DataObjectAttributeDao;
import com.ping.dao.DataObjectDao;
import com.ping.dao.TestDao;
import com.ping.entity.DataObject;
import com.ping.entity.DataObjectAttribute;
import com.ping.entity.Test;
import com.ping.service.TestService;

//@Service("userService")
@Service
public class TestServiceImpl implements TestService{

	//@Resource
	@Autowired
	private TestDao testDao;
	
	@Autowired
	private DataObjectDao dataObjectDao;
	
	@Autowired
	private DataObjectAttributeDao dataObjectAttributeDao;
	
	public Test query(Integer id) {
		Test test = testDao.queryById(id);
		System.out.println(test.getId()+","+test.getName());
		return test;
	}
	
	@Transactional(readOnly = false)
	public Integer insert(Test test){
		Integer count = testDao.insert(test);
		return count;
	}

	@Override
	public List<DataObject> getPltCodes() {
		List<DataObject> objs = dataObjectDao.getDataObjects();
		return objs;
	}

	@Override
	public List<DataObjectAttribute> objectAttribute(DataObjectAttribute data) {
		return dataObjectAttributeDao.queryByPlt(data);
	}

}
