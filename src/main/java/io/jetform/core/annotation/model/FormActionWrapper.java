package io.jetform.core.annotation.model;

import io.jetform.core.enums.Action;
import io.jetform.core.enums.Type;

public class FormActionWrapper {
	
	private String name;
	private String action = Action.CREATE.name().toLowerCase();
	private String type = Type.BUTTON.name().toLowerCase();

	private String label;

	public FormActionWrapper() {}

	public FormActionWrapper(io.jetform.core.annotation.FormAction formAction) {
		 this.name=formAction.name();
		 this.action = formAction.action().name().toLowerCase();
		 this.type= formAction.type().name().toLowerCase();
		 this.label = formAction.label();
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "FormActionWrapper [name=" + name + ", action=" + action + ", type=" + type + ", label=" + label + "]";
	}
	
}