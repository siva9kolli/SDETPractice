package org.sixAutomation.SDETTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifications {
	WebDriver driver;

	@Test
	public void isSelectedUserTypeRadioButton() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://staging.zagglesave.com/login");
		// driver.findElement(By.className("margin-l-2 cursor
		// pull-right")).isDisplayed();
		driver.findElement(By.cssSelector("span[role='presentation']")).click();

		WebElement adminRadioButton = driver
				.findElement(By.xpath("//span[text()='Admin/Approver']/preceding-sibling::span/input"));
		boolean adminRadio = adminRadioButton.isSelected();

		System.out.println("adminRadio == " + adminRadio);

		Assert.assertFalse(adminRadio);

		adminRadioButton.click();
		boolean adminRadio1 = adminRadioButton.isSelected();

		System.out.println("adminRadioAfterSelected == " + adminRadio1);

		Assert.assertTrue(adminRadio1);

	}

	@Test(dependsOnMethods = "isSelectedUserTypeRadioButton")
	public void isDisplayedSubmitButton() {
		WebElement submitButton = driver.findElement(By.tagName("button"));
		boolean submit = submitButton.isDisplayed();
		System.out.println("submit == "+ submit);
		Assert.assertTrue(submit);
	}
	

	@AfterTest
	public void killSession() {
		driver.quit();
	}

}
