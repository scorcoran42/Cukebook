package nicebank;

import static org.junit.Assert.assertEquals;
import support.KnowsTheDomain;
import cucumber.api.java.en.Then;

public class CashSlotSteps {
	KnowsTheDomain helper;
	
	public CashSlotSteps(KnowsTheDomain helper){
		this.helper = helper;
	}

	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(int dollars) throws Throwable {
	    assertEquals(dollars, helper.getCashSlot().getContents());
	}
}
