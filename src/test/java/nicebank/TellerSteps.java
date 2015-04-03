package nicebank;

import support.KnowsTheDomain;
import cucumber.api.java.en.When;

public class TellerSteps {
	KnowsTheDomain helper;
	
	public TellerSteps(KnowsTheDomain helper){
		this.helper = helper;
	}
	
	@When("^I withdraw \\$(\\d+)$")
	public void iWithdraw$(int dollars) throws Throwable {
		helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
	}

}
