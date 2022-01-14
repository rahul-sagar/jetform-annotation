package io.jetform.core.annotation.model;

import java.util.List;

public interface ElementWrapper {
	public String getId() ;
	public String getName() ;
	public String getLabel();
	public String getPlaceHolder();
	public boolean isReadOnly();
	public boolean isDisabled();
	public boolean isListable();
	public boolean isAutoComplete();
	public String getDependField();
	public String getFieldType();
	public String getValue();
	public List<Validation> getValidations(); 
	public List<DependentField> getDependentFields();
	public String getGroup();

}
