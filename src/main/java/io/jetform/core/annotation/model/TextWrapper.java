package io.jetform.core.annotation.model;


import io.jetform.core.annotation.FormElement;
import io.jetform.core.annotation.Text;
import io.jetform.core.enums.FieldType;
import io.jetform.core.helperclasses.FormBuilderUtils;

public class TextWrapper extends FormElementWrapper{
	
	public TextWrapper() {
		super();
	}
	public TextWrapper(FormElement formField) {
		setId(formField.id());
		setLabel(formField.label());
		setPlaceHolder(formField.placeHolder());
		setName(formField.name());
		setReadOnly(formField.readOnly());
		setDisabled(formField.disabled());
		setRequired(formField.required());
		setErrorMessage(formField.errorMessage());
		setValue(formField.value());
		setFieldType(FieldType.TEXT.name());
		setListable(formField.listable());
		setValidtions(FormBuilderUtils.getValidations(formField));
	}
	
	public TextWrapper(Text text) {
		setFieldType(FieldType.TEXT.name());
	}
	
	/*
	 * public List<com.adjecti.jetform.annotation.model.Validation>
	 * getValidation(FormField formField){
	 * List<com.adjecti.jetform.annotation.model.Validation> validations = new
	 * ArrayList<>(); for(Validation
	 * validation:formField.validations().validations()) validations.add(new
	 * com.adjecti.jetform.annotation.model.Validation(validation.type().name(),
	 * validation.value()));
	 * 
	 * return validations; }
	 */
	@Override
	public String toString() {
		return "TextWrapper [id=" + id + ", name=" + name + ", label=" + label + ", value=" + value + ", placeHolder="
				+ placeHolder + ", errorMessage=" + errorMessage + ", required=" + required + ", readOnly=" + readOnly
				+ ", disabled=" + disabled + ", listable=" + listable + ", fieldType=" + fieldType + ", validtions="
				+ validtions + "]";
	}
	
	
	
	
	/*
	 * @Override public String toString() { return "TextWrapper [getId()=" + getId()
	 * + ", getName()=" + getName() + ", getLabel()=" + getLabel() + ", getValue()="
	 * + getValue() + ", getPlaceHolder()=" + getPlaceHolder() +
	 * ", getErrorMessage()=" + getErrorMessage() + ", isRequired()=" + isRequired()
	 * + ", isReadOnly()=" + isReadOnly() + ", isDisabled()=" + isDisabled() +
	 * ", isListable()=" + isListable() + ", getFieldType()=" + getFieldType() +
	 * ", toString()=" + super.toString() + ", getClass()=" + getClass() +
	 * ", hashCode()=" + hashCode() + "]"; }
	 */
	
	
}

