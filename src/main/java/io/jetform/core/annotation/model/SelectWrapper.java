package io.jetform.core.annotation.model;

import java.util.Arrays;

import io.jetform.core.annotation.FormElement;
import io.jetform.core.annotation.Select;
import io.jetform.core.enums.FieldType;


public class SelectWrapper extends FormElementWrapper {
	//private String callBackUrl;
	//private SelectionType selectionType;
	private DataProvider dataProvider;
	private boolean multiSelect;
	private String[] options;
	private OptionsBundleWrapper bundle;
	
	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public SelectWrapper() {
		// TODO Auto-generated constructor stub
	}
	
	public SelectWrapper(Select select) {
       
		this.setMultiSelect(select.multiSelect());
		this.setFieldType(FieldType.SELECT.name());
		check(select);
		this.setBundle(new OptionsBundleWrapper(select));
	}
	
	public SelectWrapper(FormElement formField) {
		this.setId(formField.id());
		this.setLabel(formField.label());
		this.setPlaceHolder(formField.placeHolder());
		this.setName(formField.name());
		this.setReadOnly(formField.readOnly());
		this.setDisabled(formField.disabled());
		this.setValue(formField.value());
		this.setFieldType(FieldType.SELECT.name());
		this.setListable(formField.listable());
		this.setMultiSelect(formField.select().multiSelect());
	//	check(formField);
	}
	
	/*
	 * public void check(FormField formField) {
	 * if(!(formField.select().options()[0].isEmpty())) {
	 * setOptions(formField.select().options()); }
	 * 
	 * }
	 */
	/*
	 * public void check(FormElement formField) {
	 * if((formField.select().options().length > 0)) {
	 * this.setOptions(formField.select().options()); }else {
	 * this.setDataProvider(new DataProvider(formField.select())); } }
	 */
	public void check(Select select) {
		if((select.options().length > 0)) {
			this.setOptions(select.options());
		}else {
			this.setDataProvider(new DataProvider(select));
		}
	}
	
	public DataProvider getDataProvider() {
		return dataProvider;
	}

	public void setDataProvider(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}
	
	public boolean isMultiSelect() {
		return multiSelect;
	}

	public void setMultiSelect(boolean multiSelect) {
		this.multiSelect = multiSelect;
	}

	public OptionsBundleWrapper getBundle() {
		return bundle;
	}

	public void setBundle(OptionsBundleWrapper bundle) {
		this.bundle = bundle;
	}

	@Override
	public String toString() {
		return "SelectWrapper [dataProvider=" + dataProvider + ", multiSelect=" + multiSelect + ", options="
				+ Arrays.toString(options) + ", bundle=" + bundle + "]";
	}
	
	
	
}