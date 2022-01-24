package io.jetform.core.annotation.model;

public class FormElementEventSubscriptionWrapper {
 private String source;
 private String name;
 private String action;
 
public FormElementEventSubscriptionWrapper(String source, String name, String action) {
	this.source = source;
	this.name = name;
	this.action = action;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}
 
}
