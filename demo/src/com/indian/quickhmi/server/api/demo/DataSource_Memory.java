package com.indian.quickhmi.server.api.demo;
import java.util.ArrayList;
import java.util.HashMap;

import com.indian.quickhmi.server.api.BrowseVariable;
import com.indian.quickhmi.server.api.IDataSource_V1;
import com.indian.quickhmi.server.api.ILogger;
import com.indian.quickhmi.server.api.IVariable;
import com.indian.quickhmi.server.api.enums.Datatype;

public class DataSource_Memory implements IDataSource_V1 {

	private HashMap<IVariable, String> values = new HashMap<IVariable, String>();
	
	@Override
	public boolean init(String address, ILogger logger, ArrayList<IVariable> variables) {
		for(IVariable variable : variables) {
			values.put(variable, address + " " + variable.getAddress());
		}
		
		return true;
	}

	@Override
	public boolean start() {
		return true;
	}

	@Override
	public boolean stop() {
		values.clear();
		return true;
	}

	@Override
	public String readValue(IVariable variable) {
		return values.get(variable);
	}

	@Override
	public void writeValue(IVariable variable, String value) {
        values.put(variable, value);
	}

	@Override
	public ArrayList<BrowseVariable> browse() {
		ArrayList<BrowseVariable> variables = new ArrayList<BrowseVariable>();	
		
		//Root nodes
		variables.add(new BrowseVariable("Variable 1", Datatype.String, "Address 1"));
		variables.add(new BrowseVariable("Variable 2", Datatype.Int, "Address 2"));
		variables.add(new BrowseVariable("Variable 3", Datatype.Double, "Address 3"));
		variables.add(new BrowseVariable("Variable 4", Datatype.Short, "Address 4"));
		
		//Child nodes
		variables.get(3).addChild(new BrowseVariable("Child of Variable 4", Datatype.Short, "Address 4 Child 1"));
		variables.get(3).getChildren().get(0).addChild(new BrowseVariable("Child of Child of Variable 4", Datatype.Short, "Address 4 Child 1 Child 1"));
		
		return variables;
	}
}
