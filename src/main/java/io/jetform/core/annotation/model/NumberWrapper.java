package io.jetform.core.annotation.model;

import io.jetform.core.annotation.FormElement;
import io.jetform.core.annotation.Number;
import io.jetform.core.enums.FieldType;
import io.jetform.core.helperclasses.FormBuilderUtils;

public class NumberWrapper extends FormElementWrapper{
	private String format;

	public NumberWrapper() {
		super();
	}
	
	public NumberWrapper(FormElement formField) {
		setId(formField.id());
		setLabel(formField.label());
		setPlaceHolder(formField.placeHolder());
		setName(formField.name());
		setReadOnly(formField.readOnly());
		setDisabled(formField.disabled());
		setValue(formField.value());
		setFieldType(FieldType.NUMBER.name());
		setListable(formField.listable());
		setFormat(formField.number().format());
		setValidations(FormBuilderUtils.getValidations(formField));
	}
	public NumberWrapper(Number number) {
		
		setFieldType(FieldType.NUMBER.name());
		setFormat(number.format());
	}
	
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	
}
