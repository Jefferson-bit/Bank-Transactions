package com.crash.enums;

public enum Typetransferency {
	DEPOSIT(1),
	PIX(2),
	DOC(3),
	TED(4),
	TRANSFER(5);

	private int codeTransferency;
	
	Typetransferency(int codeTransferency) {
		this.codeTransferency = codeTransferency;
	}

	public int getCodeTransferency() {
		return codeTransferency;
	}
	
}
