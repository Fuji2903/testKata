package com.kata.testKata;

import java.math.BigDecimal;

/**
 * This class represents the bank account for a client
 * 
 * @author Christian
 *
 */
public class Account {

	private String client;
	private BigDecimal accountAmount;

	public Account(String client, BigDecimal accountAmount) {
		this.client = client;
		this.accountAmount = accountAmount;
	}

	/**
	 * Deposits money to account
	 * 
	 * @param depositeAmount
	 *            : amount to deposit
	 */
	public void deposit(BigDecimal depositeAmount) {
		this.accountAmount = this.getAccountAmount().add(depositeAmount);
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

	public String getClient() {
		return client;
	}

	public BigDecimal getAccountAmount() {
		return accountAmount;
	}
}
