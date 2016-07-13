package com.ping.dao;

import java.util.List;

import com.ping.entity.DataObjectAttribute;


public interface DataObjectAttributeDao extends CrudDao<DataObjectAttribute>{
	
	public List<DataObjectAttribute> queryByPlt(DataObjectAttribute data);

}
