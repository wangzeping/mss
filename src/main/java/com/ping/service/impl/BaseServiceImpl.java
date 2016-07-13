package com.ping.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ping.dao.CrudDao;
import com.ping.entity.Entity;
import com.ping.util.result.PageResult;


public abstract class BaseServiceImpl<D extends CrudDao<T>, T extends Entity<T>>{
	
	@Autowired
	protected D dao;
	
	
	/**
	 * ��ȡ��������
	 * @param entity
	 * @return
	 */
	public T get(T entity) {
		return dao.get(entity);
	}
	
	/**
	 * ��ѯ�б�����
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity) {
		return dao.findList(entity);
	}
	
	/**
	 * ��ҳ
	 * @param page
	 * @param entity
	 * @return
	 */
	public PageResult<T> findPage(PageResult<T> page, T entity) {
		entity.setPage(page);
		page.setData(dao.findList(entity));
		return page;
	}

}
