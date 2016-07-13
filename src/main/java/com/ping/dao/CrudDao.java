package com.ping.dao;

import java.util.List;

public interface CrudDao <T>{
	
	public T get(T entity);
	
	public List<T> findList(T entity);
	
	public List<T> findAllList(T entity);
	
	public int insert(T entity);
	
	public int update(T entity);
	
	public int delete(T entity);
	

}
