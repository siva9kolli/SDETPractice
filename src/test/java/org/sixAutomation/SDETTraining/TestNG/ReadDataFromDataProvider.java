package org.sixAutomation.SDETTraining.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromDataProvider {
	
	WebDriver driver;
	@BeforeSuite
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	
	@Test(dataProvider = "urls", dataProviderClass = SixAutomationDataProvider.class)
	public void getDataFromDP(String url) {
		
		driver.get(url);
	}
	
	
	@Test(dataProvider = "username", dataProviderClass = SixAutomationDataProvider.class)
	public void getDataFromDP1(String un, String pwd) {
		
		System.out.println("UserNames ===" +  un + " " + pwd);
	}
	
	@AfterSuite
	public void kill() {
		driver.quit();
	}

}
