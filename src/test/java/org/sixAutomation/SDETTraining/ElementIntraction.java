package org.sixAutomation.SDETTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIntraction {
	WebDriver driver;

	@Test
	public void isSelectedUserTypeRadioButton() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		
		WebElement checkBox = driver.findElement(By.cssSelector("#SubscriptionAgreement"));
		
		boolean checkBoxValue1 = checkBox.isSelected();
		System.out.println("checkBoxValue1 === "+ checkBoxValue1);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", driver.findElement(By.cssSelector("#SubscriptionAgreement")));
		
		boolean checkBoxValue = checkBox.isSelected();
		System.out.println("checkBoxValue === "+ checkBoxValue);
	}
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}

}
