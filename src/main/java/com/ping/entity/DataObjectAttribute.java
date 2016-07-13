package com.ping.entity;


public class DataObjectAttribute extends Entity<DataObjectAttribute>{
	
	private int appKey;  //�ͻ����⻧������Ӧ�ñ�ʶ
	private String platCode;  //ƽ̨����
	private String dataObject;  //ҵ�����ݶ���Ӣ�ı�ʶ��
	private String attributeName; //���ݶ�����
	private String attributeType; //���ݶ�����������͡����л��������� String���ַ�����Number�����֣�Date������(YYYY-MM-DD)��Datetime��ʱ��(YYYY-MM-DD HH:mm:SS)�������Զ�������������������� data_object �ֶ�',
	private String attributeDesc; //ҵ�����ݶ�����������',
	private boolean isArray; //���������Ƿ����飿1���ǣ�0����',
	private String columnName; //���ݶ������Զ�Ӧ�����ݿ��ֶ���
	private String columnExpr; //�����ֶ�����SQL�ֶ�ֵ���ʽ�������ֶ���ֵʱ��SQL����е����ֵ�����Ա��ʽ���루��"select a from t where b=?"����������ʵ���ֶ�ֵ��SQL����е�?�����롣
	private boolean isPK; //�Ƿ�������
	private boolean isParentPK; //�Ƿ����ݶ����ҵ������ ��������ֶΣ���1���ǣ�0����
	private boolean syncIncrement; //�Ƿ���������ͬ�����������ֶ� �������¼����ʱ�䣩��1���ǣ�0����
	private int ordinal; //����˳��
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
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getAttributeType() {
		return attributeType;
	}
	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}
	public String getAttributeDesc() {
		return attributeDesc;
	}
	public void setAttributeDesc(String attributeDesc) {
		this.attributeDesc = attributeDesc;
	}
	public boolean isArray() {
		return isArray;
	}
	public void setArray(boolean isArray) {
		this.isArray = isArray;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getColumnExpr() {
		return columnExpr;
	}
	public void setColumnExpr(String columnExpr) {
		this.columnExpr = columnExpr;
	}
	public boolean isPK() {
		return isPK;
	}
	public void setPK(boolean isPK) {
		this.isPK = isPK;
	}
	public boolean isParentPK() {
		return isParentPK;
	}
	public void setParentPK(boolean isParentPK) {
		this.isParentPK = isParentPK;
	}
	public boolean isSyncIncrement() {
		return syncIncrement;
	}
	public void setSyncIncrement(boolean syncIncrement) {
		this.syncIncrement = syncIncrement;
	}
	public int getOrdinal() {
		return ordinal;
	}
	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}
	

}
