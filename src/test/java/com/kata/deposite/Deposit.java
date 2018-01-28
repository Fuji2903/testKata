package com.kata.deposite;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import com.kata.testKata.Account;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Deposit {
	private Account account;

	@Given("^a client \"([^\"]*)\" with \"([^\"]*)\"  EUR in his account$")
	public void a_client_with_EUR_in_his_account(String arg1, String arg2) throws Throwable {
		this.account = new Account(arg2, new BigDecimal(arg2));
	}

	@When("^he deposites \"([^\"]*)\" EUR to his account$")
	public void he_deposits_EUR_to_his_account(String arg1) throws Throwable {
		this.account.deposit(new BigDecimal(arg1));
	}

	@Then("^his new balance is \"([^\"]*)\" EUR$")
	public void his_new_balance_is_EUR(String arg1) throws Throwable {
		BigDecimal newBalance = new BigDecimal(arg1);
		assertEquals(newBalance, this.account.getAccountAmount());
	}
}
