package step_definitions;

import implementation.Account;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class WithdrawlSteps {
	Account myAccount = new Account("checking", 0);
	public int dispensedAmount = 0;
	@Given("^I have \\$(\\d+) in my (\\w+) account$")
	public void iHave$InMyAccount(int amount, String account) throws Throwable {
	    Account myAccount = new Account (account, amount);
	    System.out.println("balance "+myAccount.getBalance());
	}

	@When("^I request \\$(\\d+) from my (\\w+) account$")
	public void iRequest$FromMyAccount(int amount, String account) throws Throwable {
		System.out.println("balance "+myAccount.getBalance());
		System.out.println("requested "+amount);
		dispensedAmount = (myAccount.requestCash(amount));
		System.out.println("dispensed "+dispensedAmount);
	}

	@Then("^\\$(\\d+) should be dispensed from the ATM$")
	public void $ShouldBeDispensedFromTheATM(int amount) throws Throwable {
	    assertEquals(amount, myAccount.requestCash(amount));
	}

}
