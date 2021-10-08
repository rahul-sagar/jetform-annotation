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
}