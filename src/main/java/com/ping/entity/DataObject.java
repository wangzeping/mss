package com.ping.entity;

import java.util.Date;


/**
 * API 数据对象
 * @author Arlight
 *
 */
public class DataObject {

	private int appKey; //客户（租户）方的应用标识
	private String platCode; //平台代码
	private String  dataObject; //业务数据对象（英文标识）
	private String  dataTable; //业务数据对象对应表名
	private String  clientTable; //对应客户端的业务表名。该字段仅在客户端程序由数云提供时需要配置
	private String  objectName; //业务数据对象名称（描述）
	private Date created; //创建时间
	private Date modified; //修改时间(数据库自动维护)
	public int getAppKey() {
		return appKey;
	}
	public void setAppKey(int appKey) {
		this.appKey = appKey;
	}
	public String getPlatCode() {
		return platCode;
	}
	public void setPlatCode(String platCode) {
		this.platCode = platCode;
	}
	public String getDataObject() {
		return dataObject;
	}
	public void setDataObject(String dataObject) {
		this.dataObject = dataObject;
	}
	public String getDataTable() {
		return dataTable;
	}
	public void setDataTable(String dataTable) {
		this.dataTable = dataTable;
	}
	public String getClientTable() {
		return clientTable;
	}
	public void setClientTable(String clientTable) {
		this.clientTable = clientTable;
	}
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	
	

}
