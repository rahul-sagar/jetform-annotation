package io.jetform.core.annotation.model;

import java.util.ArrayList;
import java.util.List;


import io.jetform.core.enums.FieldType;

public class FormElementWrapper implements ElementWrapper {

	protected String id;
	protected String name;
	protected String label;
	protected String value = "";
	protected String placeHolder = "";
	protected String dependField = "";

	protected boolean readOnly = false;
	protected boolean disabled = false;
	protected boolean listable = false;
	protected boolean autoComplete = false;
	protected String fieldType = FieldType.TEXT.name();
	protected List<Validation> validations = new ArrayList<>();
    protected List<DependentField> dependentFields = new ArrayList();
    protected List<FormElementEventWrapper> events = new ArrayList();
    public List<FormElementEventWrapper> getEvents() {
		return events;
	}

	public void setEvents(List<FormElementEventWrapper> events) {
		this.events = events;
	}

	public List<FormElementEventSubscriptionWrapper> getSubscribeEvents() {
		return subscribeEvents;
	}

	public void setSubscribeEvents(List<FormElementEventSubscriptionWrapper> subscribeEvents) {
		this.subscribeEvents = subscribeEvents;
	}

	protected List<FormElementEventSubscriptionWrapper> subscribeEvents = new ArrayList();
    protected String group;
	
	public List<DependentField> getDependentFields() {
		return dependentFields;
	}

	public void setDependentFields(List<DependentField> dependentFields) {
		this.dependentFields = dependentFields;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getPlaceHolder() {
		return placeHolder;
	}

	public void setPlaceHolder(String placeHolder) {
		this.placeHolder = placeHolder;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public boolean isListable() {
		return listable;
	}

	public void setListable(boolean listable) {
		this.listable = listable;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public List<Validation> getValidations() {
		return validations;
	}

	public void setValidations(List<Validation> validations) {
		this.validations = validations;
	}

	public boolean isAutoComplete() {
		// TODO Auto-generated method stub
		return this.autoComplete;
	}

	public void setAutoComplete(boolean autoComplete) {
		this.autoComplete = autoComplete;
	}

	public String getDependField() {
		return dependField;
	}

	public void setDependField(String dependField) {
		this.dependField = dependField;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGroup() {
		return group;
	}

	@Override
	public String toString() {
		return "FormElementWrapper [id=" + id + ", name=" + name + ", label=" + label + ", value=" + value
				+ ", placeHolder=" + placeHolder + ", dependField=" + dependField + ", readOnly=" + readOnly
				+ ", disabled=" + disabled + ", listable=" + listable + ", autoComplete=" + autoComplete
				+ ", fieldType=" + fieldType + ", validations=" + validations + ", dependentFields=" + dependentFields
				+ ", events=" + events + ", event=" + subscribeEvents + ", group=" + group + "]";
	}

}