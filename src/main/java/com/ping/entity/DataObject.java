package com.ping.entity;

import java.util.Date;


/**
 * API ���ݶ���
 * @author Arlight
 *
 */
public class DataObject {

	private int appKey; //�ͻ����⻧������Ӧ�ñ�ʶ
	private String platCode; //ƽ̨����
	private String  dataObject; //ҵ�����ݶ���Ӣ�ı�ʶ��
	private String  dataTable; //ҵ�����ݶ����Ӧ����
	private String  clientTable; //��Ӧ�ͻ��˵�ҵ����������ֶν��ڿͻ��˳����������ṩʱ��Ҫ����
	private String  objectName; //ҵ�����ݶ������ƣ�������
	private Date created; //����ʱ��
	private Date modified; //�޸�ʱ��(���ݿ��Զ�ά��)
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
