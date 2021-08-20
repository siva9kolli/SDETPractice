package org.sixAutomation.SDETTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class UnderstandingDriver {
	
	@Test
	public void test1() {
		
		//WebDriver driver = new SafariDriver();
		
		//RemoteWebDriver sDriver = new SafariDriver();
//		
		SafariDriver sdDriver = new SafariDriver();
		//driver.get("https://www.google.com/");
		
		//sDriver.get("https://aws.amazon.com/");
//		
		sdDriver.get("https://azure.microsoft.com/en-in/services/devops/");
	}

}
