package io.jetform.core.helperclasses;

import io.jetform.core.enums.Action;
import io.jetform.core.enums.Type;
import io.jetform.core.enums.FormActionType;

public class FormAction {
	private String URL;
	private Action action = Action.CREATE;
	private FormActionType type = FormActionType.CRUD;
	private Type ctaType = Type.BUTTON;
	///private boolean listable = true;
	private String buttonOrLinkValue;

	public FormAction() {}
	
	public FormAction(FormAction formAction) {
		
	}
	
	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public FormActionType getType() {
		return type;
	}

	public void setType(FormActionType type) {
		this.type = type;
	}

	public Type getCtaType() {
		return ctaType;
	}

	public void setCtaType(Type ctaType) {
		this.ctaType = ctaType;
	}

	/*
	 * public boolean isListable() { return listable; }
	 * 
	 * public void setListable(boolean listable) { this.listable = listable; }
	 */

	public String getButtonOrLinkValue() {
		return buttonOrLinkValue;
	}

	public void setButtonOrLinkValue(String buttonOrLinkValue) {
		this.buttonOrLinkValue = buttonOrLinkValue;
	}

	/*
	 * @Override public String toString() { return "FormAction [URL=" + URL +
	 * ", action=" + action + ", type=" + type + ", ctaType=" + ctaType +
	 * ", listable=" + listable + ", buttonOrLinkValue=" + buttonOrLinkValue + "]";
	 * }
	 */
}
