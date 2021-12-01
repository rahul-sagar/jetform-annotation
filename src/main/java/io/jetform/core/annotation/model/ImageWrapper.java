package io.jetform.core.annotation.model;

import io.jetform.core.annotation.FormElement;
import io.jetform.core.annotation.Image;
import io.jetform.core.enums.FieldType;

public class ImageWrapper extends FormElementWrapper {
	private DataProvider dataProvider;
	private String alt;
	public DataProvider getDataProvider() {
		return dataProvider;
	}
	public void setDataProvider(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	
	public ImageWrapper() {

	}
	
	public ImageWrapper(Image image) {
		setFieldType(FieldType.IMAGE.name());
	}

	public ImageWrapper(FormElement  formField) {
		
			setId(formField.id());
			setName(formField.name());
			setReadOnly(formField.readOnly());
			setDisabled(formField.disabled());
			setValue(formField.value());
			setFieldType(FieldType.IMAGE.name());
			setListable(formField.listable());
			setAlt(formField.image().alt());
	}	

}
