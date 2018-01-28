package com.kata.testKata;

import java.math.BigDecimal;

/**
 * This class represents the bank account for a client
 * 
 * @author Christian
 *
 */
public class Account {

	private Client client;
	private BigDecimal accountAmount;
	private TransactionOperation transactionOperation;

	public Account(String client, BigDecimal accountAmount) {
		this.client = new Client(client);
		this.transactionOperation = new TransactionOperation();
		this.accountAmount = accountAmount;
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
			BigDecimal value = this.accountAmount;
			this.accountAmount = BigDecimal.ZERO;
			return value;
		}
		this.accountAmount = this.accountAmount.subtract(withdrawAmount);
		return withdrawAmount;
	}

	public Client getClient() {
		return client;
	}

	public BigDecimal getAccountAmount() {
		return accountAmount;
	}

	public TransactionOperation getTransactionOperation() {
		return transactionOperation;
	}
}
