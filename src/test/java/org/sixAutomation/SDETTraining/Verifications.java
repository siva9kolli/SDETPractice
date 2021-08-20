package org.sixAutomation.SDETTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifications {
	WebDriver driver;
	String productSize = "44";

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	// @Test
	public void isSelectedUserTypeRadioButton() {

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

	// @Test(dependsOnMethods = "isSelectedUserTypeRadioButton")
	public void isDisplayedSubmitButton() {
		WebElement submitButton = driver.findElement(By.tagName("button"));
		boolean submit = submitButton.isDisplayed();
		System.out.println("submit == " + submit);
		Assert.assertTrue(submit);
	}

	@Test
	public void isElementEnabled() {
		driver.get(
				"https://www.prettylittlething.com/green-woven-cut-out-tie-waist-utility-style-blazer-bodycon-dress.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".cookie-preference__accept.button")).click();

		WebElement addToBagButton = driver.findElement(By.cssSelector("div[class$='plt-addtocart'] > button"));

		boolean valueOfButton = addToBagButton.isEnabled();

		System.out.println("valueOfButton === " + valueOfButton);

		Assert.assertFalse(valueOfButton);

		//List<WebElement> sizes = driver.findElements(By.cssSelector("div[class*='product-size-select']"));
		
		WebElement sizeOfProduct = driver.findElement(By.cssSelector("div[class*='product-size-select'][data-value='"+productSize+"']"));
		sizeOfProduct.click();
		
		boolean valueOfButtonAfterClick = addToBagButton.isEnabled();

		System.out.println("valueOfButtonAfterClick === " + valueOfButtonAfterClick);

		Assert.assertTrue(valueOfButtonAfterClick);
	}

	@AfterTest
	public void killSession() {
		driver.quit();
	}

}
