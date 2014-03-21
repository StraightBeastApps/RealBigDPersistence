package com.straightbeast.realbigd.persistence.enums;

public enum Operation {
	LESS_THAN(0, "<"),
	LESS_THAN_EQUAL(1, "<="),
	GREATER_THAN(2, ">"),
	GREATER_THAN_EQUAL(3, ">="),
	EQUAL(4, "=="),
	NONE(-1, "NA");
	
	Integer opCode;
	String opStr;
	
	Operation(Integer op, String opStr){
		this.opCode = op;
		this.opStr = opStr;
	}
	
	public static Operation getOperation(Integer opCode){
		for(Operation operation : values()){
			if(operation.opCode.equals(opCode)){
				return operation;
			}
		}
		return Operation.NONE;
	}
	
	public int getOpCode(){
		return opCode;
	}
	
	public String getOpStr(){
		return opStr;
	}
}
