package com.straightbeast.realbigd.persistence.enums;

public enum Operation {
	LESS_THAN(0),
	LESS_THAN_EQUAL(1),
	GREATER_THAN(2),
	GREATER_THAN_EQUAL(3),
	EQUAL(4),
	NONE(-1);
	
	int op;
	
	Operation(int op){
		this.op = op;
	}
}
