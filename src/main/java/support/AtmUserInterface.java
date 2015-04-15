package support;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import nicebank.Account;
import nicebank.Teller;

class AtmUserInterface implements Teller {
	
	private final EventFiringWebDriver webDriver;
	
	public AtmUserInterface() {
		this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
	}
	
	public void withdrawFrom(Account account, int dollars) {
		try {
			webDriver.get("http://localhost:9988");
			webDriver.findElement(By.id("Amount")).
				sendKeys(String.valueOf(dollars));
			webDriver.findElement(By.id("withdraw")).click();
		}
		finally {
			webDriver.close();
		}
	}
}
