package org.sixAutomation.SDETTraining.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypesOfAssertions {
	
	//@Test
	public void assertATest() {
		String str = "Java";
		String str1 = "Selenium";
		boolean yes = true;
		
		Assert.assertEquals(str, "Java");
		System.out.println("java Success");
		
		Assert.assertEquals(str1, "Selenium");
		System.out.println("selenium Success");
		
		Assert.assertTrue(yes);
		System.out.println("Test Success");
	}
	
	@Test
	public void verifyTextOnThePage() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		WebElement locationsLink = driver.findElement(By.xpath("//div[@id='headerPanel']/ul/li/a[text()='Locations']"));
		WebElement adminPageLink = driver.findElement(By.xpath("//div[@id='headerPanel']/ul/li/a[text()='Admin Page']"));
		
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(locationsLink.getText(), "ABC");
		sa.assertTrue(adminPageLink.isDisplayed());
		System.out.println("Test Completed");
		sa.assertAll();
		driver.quit();
	}

}
