package io.jetform.core.annotation.model;

import io.jetform.core.annotation.Template;
import io.jetform.core.enums.FieldType;

public class TemplateWrapper extends FormElementWrapper{
   private String filePath;
   
   public TemplateWrapper() {
	// TODO Auto-generated constructor stub
   }
   
   public TemplateWrapper(Template template) {
	      setFilePath(template.filePath());
	      setFieldType(FieldType.TEMPLATE.name());
   }
  
   public String getFilePath() {
	return filePath;
   }
   
   public void setFilePath(String filePath) {
	this.filePath = filePath;
   }
}
