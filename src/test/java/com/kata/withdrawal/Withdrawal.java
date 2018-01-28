package com.kata.withdrawal;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import com.kata.testKata.Account;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Withdrawal {
	private Account account;
	private BigDecimal amountWithdraw = BigDecimal.ZERO;

	@Given("^a client \"([^\"]*)\" with \"([^\"]*)\"  EUR in his account$")
	public void a_client_with_EUR_in_his_account(String arg1, String arg2) throws Throwable {
		this.account = new Account(arg2, new BigDecimal(arg2));
	}

	@When("^he withdraws \"([^\"]*)\" EUR to his account$")
	public void he_withdraws_EUR_to_his_account(String arg1) throws Throwable {
		this.amountWithdraw = this.account.withdraw(new BigDecimal(arg1));
	}

	@Then("^his new balance is \"([^\"]*)\" EUR and amount withdraw is \"([^\"]*)\"$")
	public void his_new_balance_is_EUR_and_amount_withdraw_is(String arg1, String arg2) throws Throwable {
		BigDecimal newBalance = new BigDecimal(arg1);
		assertEquals(newBalance, this.account.getAccountAmount());

		BigDecimal expectedAmountWithdraw = new BigDecimal(arg2);
		assertEquals(expectedAmountWithdraw, amountWithdraw);
	}
}
