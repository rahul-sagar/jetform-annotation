package io.jetform.core.annotation.model;

import io.jetform.core.annotation.Email;
import io.jetform.core.annotation.FormElement;
import io.jetform.core.enums.FieldType;
import io.jetform.core.helperclasses.FormBuilderUtils;

public class EmailWrapper extends FormElementWrapper {
	private String pattern;

	public EmailWrapper() {}
	
	public EmailWrapper(FormElement formField) {

		setId(formField.id());
		setLabel(formField.label());
		setPlaceHolder(formField.placeHolder());
		setName(formField.name());
		setReadOnly(formField.readOnly());
		setDisabled(formField.disabled());
		setValue(formField.value());
		setFieldType(FieldType.EMAIL.name());
		setListable(formField.listable());
		setPattern(formField.email().pattern());
		setValidations(FormBuilderUtils.getValidations(formField));
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