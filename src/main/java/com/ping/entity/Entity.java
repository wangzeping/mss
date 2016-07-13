package com.ping.entity;

import com.ping.util.result.PageResult;

public class Entity<T> extends PageResult<T>{

	private PageResult<T> page;

	public PageResult<T> getPage() {
		return page;
	}

	public void setPage(PageResult<T> page) {
		this.page = page;
	}
	

}
