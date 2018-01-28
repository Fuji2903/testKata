package com.kata.testKata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the bank account for a client
 * 
 * @author Christian
 *
 */
public class Account {

	private String client;
	private BigDecimal accountAmount;
	private List<Operation> operationList;

	public Account(String client, BigDecimal accountAmount) {
		this.client = client;
		this.accountAmount = accountAmount;
		this.operationList = new ArrayList<>();
	}

	/**
	 * Deposits money to account
	 * 
	 * @param depositeAmount
	 *            : amount to deposit
	 */
	public void deposit(BigDecimal depositeAmount) {
		this.accountAmount = this.accountAmount.add(depositeAmount);
	}

	/**
	 * Withdraws money to account
	 * 
	 * @param bigDecimal
	 *            amount to withdraw
	 * @return amount withdraw
	 */
	public BigDecimal withdraw(BigDecimal withdrawAmount) {
		if (this.accountAmount.compareTo(BigDecimal.ZERO) <= 0) {
			return BigDecimal.ZERO;
		}
		if (withdrawAmount.compareTo(this.accountAmount) >= 0) {
			this.accountAmount = BigDecimal.ZERO;
			return withdrawAmount.subtract(this.accountAmount);
		}
		this.accountAmount = this.accountAmount.subtract(withdrawAmount);
		return withdrawAmount;
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

	public String getClient() {
		return client;
	}

	public BigDecimal getAccountAmount() {
		return accountAmount;
	}

	public List<Operation> getOperationList() {
		return operationList;
	}
}
