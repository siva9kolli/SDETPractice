package org.sixAutomation.SDETTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	public WebDriver driver;
	
	@Test
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://parabank.parasoft.com/");
		driver.navigate().to("http://the-internet.herokuapp.com/");
		//
		driver.findElement(By.xpath("//a[normalize-space()='Dropdown']")).click();
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}

}
