package com.kata.testKata;

public enum OperationType {
	DEPOSIT("DEPOSIT"), WITHDRAW("WITHDRAW");

	public String description;

	private OperationType(final String description) {
		this.description = description;
	}
}
