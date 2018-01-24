import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Deposite {

	@Given("^a client with (\\d+) EUR in his account$")
	public void a_client_with_EUR_in_his_account(int arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@When("^he deposites (\\d+) EUR to his account$")
	public void he_deposites_EUR_to_his_account(int arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Then("^his new balance is (\\d+) EUR$")
	public void his_new_balance_is_EUR(int arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}
}
