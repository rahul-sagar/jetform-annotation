package io.jetform.core.annotation.model;

import io.jetform.core.annotation.Email;
import io.jetform.core.annotation.FormElement;
import io.jetform.core.enums.FieldType;
import io.jetform.core.helperclasses.FormBuilderUtils;

public class EmailWrapper extends FormElementWrapper {
	private String pattern;

	public EmailWrapper() {}
	
	public EmailWrapper(FormElement formElement) {

		setId(formElement.id());
		setLabel(formElement.label());
		setPlaceHolder(formElement.placeHolder());
		setName(formElement.name());
		setReadOnly(formElement.readOnly());
		setDisabled(formElement.disabled());
		setValue(formElement.value());
		setFieldType(FieldType.EMAIL.name());
		setListable(formElement.listable());
		setPattern(formElement.email().pattern());
		setValidations(FormBuilderUtils.getValidations(formElement));
	}
	public EmailWrapper(Email email) {
		setFieldType(FieldType.EMAIL.name());
		setPattern(email.pattern());
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}


}