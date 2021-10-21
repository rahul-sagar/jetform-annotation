package io.jetform.core.annotation.model;

import java.util.List;

import io.jetform.core.annotation.JetForm;

public class JetFormWrapper {
	private String id;
	private String name;
	private String title;
	private List<FormActionWrapper> actions;
	private List<FormElementWrapper> elements;

	public JetFormWrapper(JetForm jetForm){
		this.id = jetForm.id();
		this.name = jetForm.name();
		this.title = jetForm.title();
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

	@Override
	public String toString() {
		return "JetFormWrapper [id=" + id + ", name=" + name + ", title=" + title + ", actions=" + actions
				+ ", elements=" + elements + "]";
	}

	
	
}
