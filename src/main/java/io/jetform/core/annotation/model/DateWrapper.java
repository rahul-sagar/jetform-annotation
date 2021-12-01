package io.jetform.core.annotation.model;

import io.jetform.core.annotation.Date;
import io.jetform.core.annotation.FormElement;
import io.jetform.core.enums.FieldType;
import io.jetform.core.helperclasses.FormBuilderUtils;

public class DateWrapper extends FormElementWrapper {
	
	private String format;
	
	public DateWrapper() {
		
	}
	
    public DateWrapper(FormElement formElement) {
    	setId(formElement.id());
		setLabel(formElement.label());
		setPlaceHolder(formElement.placeHolder());
		setName(formElement.name());
		setReadOnly(formElement.readOnly());
		setDisabled(formElement.disabled());
		setValue(formElement.value());
		setFieldType(FieldType.DATE.name());
		setListable(formElement.listable());
		setFormat(formElement.date().format());
		setValidations(FormBuilderUtils.getValidations(formElement));
	}
    
    public DateWrapper(Date date) {
    	setFieldType(FieldType.DATE.name());
        setFormat(date.format());
	}

	public void setFormat(String format) {
		this.format = format;
	}
    
    public String getFormat() {
		return format;
	}
}