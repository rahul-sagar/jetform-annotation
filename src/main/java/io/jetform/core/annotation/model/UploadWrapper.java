package io.jetform.core.annotation.model;

import io.jetform.core.annotation.FormElement;
import io.jetform.core.annotation.Upload;
import io.jetform.core.enums.FieldType;
import io.jetform.core.enums.UploadType;

public class UploadWrapper extends FormElementWrapper {
	
	private DataProvider dataProvider;
	private UploadType  type;
	
	public DataProvider getDataProvider() {
		return dataProvider;
	}
	
	public void setDataProvider(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}
	
	public UploadType getType() {
		return type;
	}

	public void setType(UploadType type) {
		this.type = type;
	}

	public UploadWrapper() {

	}
	
	public UploadWrapper(Upload image) {
		setFieldType(image.type().name());
		setDataProvider(new DataProvider(image));
	}

	public UploadWrapper(FormElement  formField) {
		
			setId(formField.id());
			setName(formField.name());
			setReadOnly(formField.readOnly());
			setDisabled(formField.disabled());
			setValue(formField.value());
			setFieldType(formField.upload().type().name());
			setListable(formField.listable());
			setType(formField.upload().type());
	}

}