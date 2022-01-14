package io.jetform.core.annotation.model;

import java.util.List;

import io.jetform.core.annotation.FormElementGroup;

public class FormElementGroupWrapper {
	private String id;
	private String label;
	private int elementsPerRow;
	private List<FormElementWrapper> elements;
	
	public FormElementGroupWrapper(FormElementGroup group) {
          setId(group.id());
          setLabel(group.label());
          setElementsPerRow(group.elementsPerRow());
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getElementsPerRow() {
		return elementsPerRow;
	}
	public void setElementsPerRow(int elementsPerRow) {
		this.elementsPerRow = elementsPerRow;
	}
	public List<FormElementWrapper> getElements() {
		return elements;
	}
	public void setElements(List<FormElementWrapper> elements) {
		this.elements = elements;
	}
	
}
