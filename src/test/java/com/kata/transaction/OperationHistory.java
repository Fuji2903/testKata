package com.kata.transaction;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.kata.testKata.Account;
import com.kata.testKata.Operation;
import com.kata.testKata.OperationType;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;

public class OperationHistory {
	private Account account;
	private List<Operation> listOperation;

	@Given("^a client \"([^\"]*)\" with \"([^\"]*)\"  EUR in his account with no transaction$")
	public void a_client_with_EUR_in_his_account_with_no_transaction(String arg1, String arg2) throws Throwable {
		this.account = new Account(arg2, new BigDecimal(arg2));
	}

	@When("^he gets history of all operations$")
	public void he_gets_history_of_all_operations() throws Throwable {
		this.listOperation = this.account.getOperationList();
	}

	@Then("^transacations list should be empty$")
	public void transacations_list_should_be_empty() throws Throwable {
		assertEquals(0, this.account.getOperationList().size());
	}

	@Given("^a client \"([^\"]*)\" with \"([^\"]*)\"  EUR makes a deposit transaction of \"([^\"]*)\" EUR$")
	public void a_client_with_EUR_makes_a_deposit_transaction_of_EUR(String arg1, String arg2, String arg3)
			throws Throwable {

		this.account = new Account(arg2, new BigDecimal(arg2));
		this.account.deposit(new BigDecimal(arg3));
		Operation operation = new Operation();
		operation.setBalance(this.account.getAccountAmount());
		operation.setAmountTransaction(new BigDecimal(arg3));
		operation.setTransactionType(OperationType.DEPOSIT);
		operation.setOperationDate(new Date());
		this.account.addOperation(operation);
	}

	@Given("^a deposit opeation of \"([^\"]*)\" EUR$")
	public void a_deposit_opeation_of_EUR(String arg1) throws Throwable {
		this.account.deposit(new BigDecimal(arg1));
		Operation operation = new Operation();
		operation.setBalance(this.account.getAccountAmount());
		operation.setAmountTransaction(new BigDecimal(arg1));
		operation.setTransactionType(OperationType.DEPOSIT);
		operation.setOperationDate(new Date());
		this.account.addOperation(operation);
	}

	@Given("^a withdrawal opeation of \"([^\"]*)\" EUR$")
	public void a_withdrawal_opeation_of_EUR(String arg1) throws Throwable {
		this.account.withdraw(new BigDecimal(arg1));
		Operation operation = new Operation();
		operation.setBalance(this.account.getAccountAmount());
		operation.setAmountTransaction(new BigDecimal(arg1));
		operation.setTransactionType(OperationType.WITHDRAW);
		operation.setOperationDate(new Date());
		this.account.addOperation(operation);
	}

	@Then("^opeations list should be (\\d+)$")
	public void opeations_list_should_be(int arg1) throws Throwable {
		assertEquals(4, this.listOperation.size());
	}

	@Then("^opeations list should contains$")
	public void opeations_list_should_contains(DataTable arg1) throws Throwable {
		List<DataTableRow> rowList = arg1.getGherkinRows();

		for (int i = 0; i < rowList.size(); i++) {
			List<String> listTable = rowList.get(i).getCells();
			Operation operation = listOperation.get(i);

			assertEquals(OperationType.valueOf(listTable.get(0)), operation.getTransactionType());
			assertEquals(new BigDecimal(listTable.get(1)), operation.getAmountTransaction());
			assertEquals(new BigDecimal(listTable.get(2)), operation.getBalance());
		}
	}
}
