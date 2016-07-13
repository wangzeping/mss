package com.ping.entity;


public class DataObjectAttribute extends Entity<DataObjectAttribute>{
	
	private int appKey;  //客户（租户）方的应用标识
	private String platCode;  //平台代码
	private String dataObject;  //业务数据对象（英文标识）
	private String attributeName; //数据对象名
	private String attributeType; //数据对象的属性类型。其中基础类型有 String：字符串；Number：数字；Date：日期(YYYY-MM-DD)；Datetime：时间(YYYY-MM-DD HH:mm:SS)；其他自定义数据类型请关联本表 data_object 字段',
	private String attributeDesc; //业务数据对象属性描述',
	private boolean isArray; //数据类型是否数组？1：是，0：否',
	private String columnName; //数据对象属性对应的数据库字段名
	private String columnExpr; //数据字段入库的SQL字段值表达式。当本字段有值时，SQL语句中的入库值将该以表达式代入（如"select a from t where b=?"）；否则以实际字段值（SQL语句中的?）代入。
	private boolean isPK; //是否主键？
	private boolean isParentPK; //是否父数据对象的业务主键 （即外键字段）？1：是；0：否
	private boolean syncIncrement; //是否数据增量同步所依赖的字段 （例如记录更新时间）？1：是；0：否
	private int ordinal; //属性顺序
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
