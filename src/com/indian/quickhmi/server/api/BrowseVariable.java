package com.indian.quickhmi.server.api;

import java.util.ArrayList;

import com.indian.quickhmi.server.api.enums.Datatype;

/**
 * Class representing a variable that can be imported into the QuickHMI Editor.
 * If imported, the variable in die Editor will contain the same information as this BrowseVariable object.
 */
public class BrowseVariable {
	private String name;
	private Datatype dataType;
	private String address;
	private ArrayList<BrowseVariable> children = new ArrayList<BrowseVariable>();
	
	public BrowseVariable(String name, Datatype dataType, String address) {
		this.name = name;
		this.dataType = dataType;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Datatype getDataType() {
		return dataType;
	}
	
	public void setDataType(Datatype dataType) {
		this.dataType = dataType;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public ArrayList<BrowseVariable> getChildren() {
		return children;
	}
	
	public void addChild(BrowseVariable child) {
		children.add(child);
	}
	
	public void removeChild(BrowseVariable child) {
		children.remove(child);
	}
	
	public void setChildren(ArrayList<BrowseVariable> children) {
		this.children = children;
	}
}
