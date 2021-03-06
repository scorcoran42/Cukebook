package nicebank;

import static org.junit.Assert.assertEquals;
import support.KnowsTheDomain;
import transforms.MoneyConverter;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class AccountSteps {
	KnowsTheDomain helper;
	
	public AccountSteps(KnowsTheDomain helper){
		this.helper = helper;
	}
	
	@Given("^My account has been credited with (\\$\\d+.\\d+)$")
	public void myAccountHasBeenCreditedWith$(@Transform(MoneyConverter.class) Money amount) throws Throwable {
	    helper.getMyAccount().credit(amount);
	}
	
	@Then("^the balance of my account should be (\\$\\d+\\.\\d+)$")
	public void theBalanceOfMyAccountShouldBe$(@Transform(MoneyConverter.class) Money amount) throws Throwable {

		assertEquals("Incorrect account balance - ", amount, helper.getMyAccount().getBalance());
	}
}
