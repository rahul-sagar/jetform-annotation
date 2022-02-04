package io.jetform.core.annotation.model;

import io.jetform.core.annotation.CustomField;
import io.jetform.core.enums.FieldType;

public class CustomFieldWrapper extends FormElementWrapper{
   private String filePath;
   
   public CustomFieldWrapper() {
	// TODO Auto-generated constructor stub
   }
   
   public CustomFieldWrapper(CustomField customField) {
	      setFilePath(customField.filePath());
	      setFieldType(FieldType.CUSTOM_FIELD.name());
   }
  
   public String getFilePath() {
	return filePath;
   }
   
   public void setFilePath(String filePath) {
	this.filePath = filePath;
   }
}
