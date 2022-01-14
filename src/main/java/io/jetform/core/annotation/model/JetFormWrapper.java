package io.jetform.core.annotation.model;

import java.util.List;

import io.jetform.core.annotation.FormElementGroup;
import io.jetform.core.annotation.JetForm;

public class JetFormWrapper {
	private String id;
	private String name;
	private String title;
	private String filter;
	private boolean listIndex;
	private boolean selectable;
	private String formTemplate;
	private List<FormActionWrapper> actions;
	private List<FormElementWrapper> elements;
    private List<FormElementGroupWrapper> groups;
	
	public JetFormWrapper(JetForm jetForm){
		this.id = jetForm.id();
		this.name = jetForm.name();
		this.title = jetForm.title();
		this.listIndex=jetForm.listIndex();
		this.selectable=jetForm.selectable();
		this.formTemplate=jetForm.formTemplate();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<FormActionWrapper> getActions() {
		return actions;
	}

	public void setActions(List<FormActionWrapper> actions) {
		this.actions = actions;
	}

	public List<FormElementWrapper> getElements() {
		return elements;
	}

	public void setElements(List<FormElementWrapper> elements) {
		this.elements = elements;
	}

	
	public boolean isListIndex() {
		return listIndex;
	}

	public void setListIndex(boolean listIndex) {
		this.listIndex = listIndex;
	}

	public boolean isSelectable() {
		return selectable;
	}

	public void setSelectable(boolean selectable) {
		this.selectable = selectable;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public List<FormElementGroupWrapper> getGroups() {
		return groups;
	}

	public void setGroups(List<FormElementGroupWrapper> groups) {
		this.groups = groups;
	}

	public String getFormTemplate() {
		return formTemplate;
	}

	public void setFormTemplate(String formTemplate) {
		this.formTemplate = formTemplate;
	}

	@Override
	public String toString() {
		return "JetFormWrapper [id=" + id + ", name=" + name + ", title=" + title + ", filter=" + filter
				+ ", listIndex=" + listIndex + ", selectable=" + selectable + ", formTemplate=" + formTemplate
				+ ", actions=" + actions + ", elements=" + elements + ", groups=" + groups + "]";
	}

	
}