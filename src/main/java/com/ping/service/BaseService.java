package com.ping.service;

import java.util.List;

import com.ping.entity.Entity;

public interface BaseService<T extends Entity<T>>{

	public T get(T entity);
	
	/**
	 * 查询列表数据
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity);
}
