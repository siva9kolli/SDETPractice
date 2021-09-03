package org.sixAutomation.SDETTraining.TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {
	/**
	 * Implicit wait - Exception is NoSUchElementException
	 * PageLoad wait - 
	 * Explict Wait 
	 * ** WebDriverWait - Exception is TimeOutException and default time interval is 500 ms
	 * ** FluentWait - Exception is TimeOutException and default time interval is based on provided time in ms
	 */
	WebDriver driver;
	
	@BeforeTest
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/");
	}
	
	@Test
	public void pageLoadTimeWait() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	//@Test
	public void understadingImplicitWait() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
		loginButton.click();
		//driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("test"));
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}
	
	//@Test 
	public void understandingWebDriverWait() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("Selenium");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("password")))).sendKeys("Appium12345");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input[value='Log In']")))).click();
		wait.until(ExpectedConditions.textToBe(By.xpath("//h1[text()='Error!']"), "Error!"));
		System.out.println("Test");
		
	}
	
	//@Test
	public void understandingFluentWait() {
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(4))
				.withTimeout(Duration.ofSeconds(20))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("Expected Element not found");
		
		fWait.until(ExpectedConditions.textToBe(By.xpath("//div/h2"), "Customer Logi"));
				
	}
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}

}
