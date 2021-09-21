package org.sixAutomation.SDETTraining.TestNG;

import org.testng.annotations.DataProvider;

public class SixAutomationDataProvider {
	

	@DataProvider(name = "urls")
	public Object[][] dataProvider1(){
		return new Object[][] {{"https://parabank.parasoft.com/"}, {"http://automationpractice.com/index.php"}, {"http://the-internet.herokuapp.com/"}};
	}
	
	@DataProvider(name = "username")
	public Object[][]  dataProvider2() {
		return new Object[][] {{"Selenium1", "password"}, {"Selenium2", "password"}, {"Selenium3", "password"}, {"Selenium4", "password"}};
	}
}
