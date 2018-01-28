package com.kata.testKata;

import java.math.BigDecimal;

public class Account {

	private String client;
	private BigDecimal accountAmount;

	public Account(String client, BigDecimal accountAmount) {
		this.client = client;
		this.accountAmount = accountAmount;
	}

	public void deposite(BigDecimal depositeAmount) {
		this.accountAmount = this.getAccountAmount().add(depositeAmount);
	}

	public String getClient() {
		return client;
	}

	public BigDecimal getAccountAmount() {
		return accountAmount;
	}

	public BigDecimal withdraw(BigDecimal bigDecimal) {
		return null;
	}
}
