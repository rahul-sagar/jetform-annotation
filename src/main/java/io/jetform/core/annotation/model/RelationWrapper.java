package io.jetform.core.annotation.model;

import java.util.Arrays;

import io.jetform.core.annotation.Relation;

public class RelationWrapper {
	//relatioClass=TaxItem.class,keyField="id",lableField="name")
	private Class<?> relationClass;
	private String keyField;
	private String labelField;
	private String[] filter;
	
	public RelationWrapper(Relation relation) {
		this.relationClass = relation.relationClass();
		this.keyField = relation.keyField();
		this.labelField = relation.labelField();
		this.filter = relation.filter();
	}
	
	public RelationWrapper(String keyField,String lableField) {
		this.keyField = keyField;
		this.labelField = lableField;
	}
	
	public Class<?> getRelationClass() {
		return relationClass;
	}
	public void setRelationClass(Class<?> relatioClass) {
		this.relationClass = relatioClass;
	}
	public String getKeyField() {
		return keyField;
	}
	public void setKeyField(String keyField) {
		this.keyField = keyField;
	}
	public String getLabelField() {
		return labelField;
	}
	public void setLabelField(String lableField) {
		this.labelField = lableField;
	}

	public String[] getFilter() {
		return filter;
	}

	public void setFilter(String[] filter) {
		this.filter = filter;
	}

	@Override
	public String toString() {
		return "RelationWrapper [relationClass=" + relationClass + ", keyField=" + keyField + ", labelField="
				+ labelField + ", filter=" + Arrays.toString(filter) + "]";
	}
	
	

}
