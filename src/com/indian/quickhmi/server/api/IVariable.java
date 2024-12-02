package com.indian.quickhmi.server.api;

import com.indian.quickhmi.server.api.enums.Datatype;

/**
 * Interface representing a variable that has been created in the QuickHMI Editor.
 */
public interface IVariable {
	
	/**
     * Gets the ID of this variable.
     * @return the id
     */
	public long getId();
	
	/**
	 * Gets the data type of this variable.
	 * @return the datatype
	 */
	public Datatype getDataType();
	
	/**
     * Gets the name of this variable.
     * @return the name
     */
	public String getName();
	
	/**
     * Gets the address of this variable.
     * @return the address
     */
	public String getAddress();
	
}
