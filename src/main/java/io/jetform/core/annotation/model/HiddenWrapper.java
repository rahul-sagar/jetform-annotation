package io.jetform.core.annotation.model;

import io.jetform.core.annotation.FormElement;
import io.jetform.core.annotation.Hidden;
import io.jetform.core.enums.FieldType;
import io.jetform.core.helperclasses.FormBuilderUtils;

public class HiddenWrapper extends FormElementWrapper{
	public HiddenWrapper() {
		super();
	}
	public HiddenWrapper(FormElement formField) {
		setId(formField.id());
		setLabel(formField.label());
		setPlaceHolder(formField.placeHolder());
		setName(formField.name());
		setReadOnly(formField.readOnly());
		setDisabled(formField.disabled());
		setValue(formField.value());
		setFieldType(FieldType.TEXT.name());
		setListable(formField.listable());
		setValidations(FormBuilderUtils.getValidations(formField));
	}
	
	public HiddenWrapper(Hidden hidden) {
		setFieldType(FieldType.HIDDEN.name());
	}
}
