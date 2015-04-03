package nicebank;

import static org.junit.Assert.assertEquals;
import support.KnowsTheDomain;
import transforms.MoneyConverter;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;


public class AccountSteps {
	KnowsTheDomain helper;
	
	public AccountSteps(KnowsTheDomain helper){
		this.helper = helper;
	}
	
	@Given("^I have deposited (\\$\\d+.\\d+) in my account$")
	public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
	    helper.getMyAccount().deposit(amount);
	    
	    assertEquals("Incorrect account balance - ", amount, helper.getMyAccount().getBalance());
	}
}
