package io.jetform.core.annotation.model;

import java.util.List;

import io.jetform.core.annotation.JetForm;

public class JetFormWrapper {
	private String id;
	private String name;
	private String title;
	private boolean listIndex;
	private boolean selectable;
	private List<FormActionWrapper> actions;
	private List<FormElementWrapper> elements;

	public JetFormWrapper(JetForm jetForm){
		this.id = jetForm.id();
		this.name = jetForm.name();
		this.title = jetForm.title();
		this.listIndex=jetForm.listIndex();
		this.selectable=jetForm.selectable();
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

	@Override
	public String toString() {
		return "JetFormWrapper [id=" + id + ", name=" + name + ", title=" + title + ", listIndex=" + listIndex
				+ ", selectable=" + selectable + ", actions=" + actions + ", elements=" + elements + "]";
	}	
}