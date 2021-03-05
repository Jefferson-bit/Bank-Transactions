package com.crash.enums;

public enum CurrencyCode {
	
	EUR(1),
	USD(2),
	JPY(3);
	
	private int codeCoin;
	
	CurrencyCode(int codeCoin) {
		this.codeCoin = codeCoin;
	}

	public int getCodeCoin() {
		return codeCoin;
	}
	
}
