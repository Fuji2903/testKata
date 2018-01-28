package com.kata.testKata;

/**
 * Enumerator of operation type
 * @author Christian
 *
 */
public enum OperationType {
	DEPOSIT("DEPOSIT"), WITHDRAW("WITHDRAW");

	public String description;

	private OperationType(final String description) {
		this.description = description;
	}
}
