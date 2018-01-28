package com.kata.testKata;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains all operation of an account
 * @author Christian
 *
 */
public class TransactionOperation {

	private List<Operation> operationList;

	public TransactionOperation() {
		this.operationList = new ArrayList<>();
	}

	/**
	 * Adds new transaction to list
	 * 
	 * @param transaction
	 *            new transaction
	 */
	public void addOperation(Operation transaction) {
		if (transaction != null)
			getOperationList().add(transaction);
	}

	public List<Operation> getOperationList() {
		return operationList;
	}
}
