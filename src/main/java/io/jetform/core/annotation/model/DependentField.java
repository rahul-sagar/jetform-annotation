package io.jetform.core.annotation.model;

public class DependentField {
	   private String child;
	   private String datapath;
	   private String type;
	   
	   public DependentField() {
		// TODO Auto-generated constructor stub
	}
	   
	public DependentField(String child, String datapath, String type) {
		super();
		this.child = child;
		this.datapath = datapath;
		this.type = type;
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public String getDatapath() {
		return datapath;
	}
	public void setDatapath(String datapath) {
		this.datapath = datapath;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "DependentField [child=" + child + ", datapath=" + datapath + ", type=" + type + "]";
	}
   
}