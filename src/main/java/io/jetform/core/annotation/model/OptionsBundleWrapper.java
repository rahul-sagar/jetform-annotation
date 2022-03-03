package io.jetform.core.annotation.model;

import io.jetform.core.annotation.Select;

public class OptionsBundleWrapper {
	private String path;
	private String key;

	public OptionsBundleWrapper(Select select) {
		this.path = select.bundle().path();
		this.key = select.bundle().key();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
