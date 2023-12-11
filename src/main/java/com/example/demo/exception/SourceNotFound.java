package com.example.demo.exception;

public class SourceNotFound  extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Object fieldvalue;
	public SourceNotFound(String resourceName, String fieldName, Object fieldvalue) {
		super();
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldvalue = fieldvalue;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public Object getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(Object fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
