package com.indian.quickhmi.server.api.enums;

public enum Datatype {
	Boolean(0),
	Byte(1),
	Int(2),
	UByte(5),
	Float(9),
	Double(10),
	String(12),
	DateTime(19),
	Color(20),
	Short(21),
	UShort(22),
	Long(25),
	ULong(26),
	Time(31),
	TimeOfDay(32),
	Date(33),
	UInt(35);
    
	
	private final int value;
	
	Datatype(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
}
