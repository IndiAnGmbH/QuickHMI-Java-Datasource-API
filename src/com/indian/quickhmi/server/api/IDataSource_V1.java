package com.indian.quickhmi.server.api;

import java.util.ArrayList;

/**
 * Interface representing a data source that provides data to the QuickHMI Runtime.
 */
public interface IDataSource_V1 {
	
    /**
     * Initializes the data source with a list of variables.
     * Is only called once during the server's startup. Exception: Will be called once every 30 seconds if the first initialization fails.
     *
     * @param address: The address of the data source as defined in the editor.
     * @param variables: The list of variables assigned to this data source. Each variable contains name, datatype and address as defined in the editor.
     * @param logger: Provides logging functionality. Messages will be written to the servers logging files.
     * 
     * @return true if the initialization was successful, false otherwise. This function will be called periodically when false is returned, in an attempt to start the data source.
     */
    public boolean init(String address, ILogger logger, ArrayList<IVariable> variables);
    
    /**
     * Starts the data source.
     * Is called once after all data sources have been initialized.
     *
     * @return true if the data source was started successfully, false otherwise
     */
    public boolean start();
    
    /**
     * Stops the data source.
     * Is called when the server is shutting down.
     *
     * @return true if the data source was stopped successfully, false otherwise
     */
    public boolean stop();
    
    /**
     * Reads the value of a given variable from the data source.
     * This function will be called once for every variable every data source tick. The tick rate can be defined in the editor.
     *
     * @param variable: The variable to read the value from.
     * @return the value of the variable as a String
     * @throws Exception if an error occurs while reading the value. The exceptions message will be displayed to the user.
     */
    public String readValue(IVariable variable) throws Exception;
    
    /**
     * Writes a value to a given variable in the data source.
     * This function will be called whenever a variable is supposed to be updated.
     *
     * @param variable: The variable to write the value to
     * @param value: The value to write to the variable
     * @throws Exception if an error occurs while writing the value. The exceptions message will be displayed to the user.
     */
    public void writeValue(IVariable variable, String value) throws Exception;
    
    /**
     * Browses the variables in the data source.
     * This is only used by the QuickHMI editor when browsing this datasource for available variables.
     *
     * @return a list of variables in the data source to be displayed in the editor.
     */
    public ArrayList<BrowseVariable> browse();
    
}