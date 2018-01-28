package com.kata.testKata;

import java.math.BigDecimal;
import java.util.Date;

public class Operation {
	private OperationType transactionType;
	private Date operationDate;
	private BigDecimal amountTransaction;
	private BigDecimal balance;

	public OperationType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(OperationType transactionType) {
		this.transactionType = transactionType;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public BigDecimal getAmountTransaction() {
		return amountTransaction;
	}

	public void setAmountTransaction(BigDecimal amountTransaction) {
		this.amountTransaction = amountTransaction;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}
