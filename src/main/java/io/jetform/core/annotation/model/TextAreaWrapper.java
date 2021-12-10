package io.jetform.core.annotation.model;

import io.jetform.core.annotation.TextArea;
import io.jetform.core.enums.FieldType;

public class TextAreaWrapper extends FormElementWrapper {

	private int rows;
	private int columns;

	public TextAreaWrapper() {
	}
	
	public TextAreaWrapper(TextArea textArea) {
      setRows(textArea.rows());
      setColumns(textArea.cols());
      setFieldType(FieldType.TEXT_AREA.name());
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

}