package com.ping.util.result;

import java.util.ArrayList;
import java.util.List;

public class PageResult<T> {

	/**ҳ���С*/
	private Integer pageSize;
	
	/**��ǰҳ��*/
	private Integer pageNo;
	
	/**��������*/
	private Integer count;
	
	private List<T> data = new ArrayList<T>();

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
