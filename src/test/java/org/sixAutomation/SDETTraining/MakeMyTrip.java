package org.sixAutomation.SDETTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip{
	WebDriver driver;
	String url = "https://www.makemytrip.com/";
	String fromCityValue = "Mumbai, India";
	String toCityValue = "Chennai, India";
	String month = "October";
	String date = "10";
	
	@Test
	public void passDynamicValues() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		WebElement fromCityInput = driver.findElement(By.cssSelector("#fromCity"));
//		WebElement toCityInput = driver.findElement(By.cssSelector("#toCity"));
//		
//
//		fromCityInput.sendKeys(fromCityValue);		
//		WebElement firstElement = driver.findElement(By.cssSelector("ul[role='listbox'] > li:first-of-type"));
//		firstElement.click();
//		
//		toCityInput.sendKeys(toCityValue);
//		firstElement.click();
//		
//		
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		
		WebElement departureDateField = driver.findElement(By.cssSelector("p[data-cy='departureDate']"));
		departureDateField.click();
		
		driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div/div[contains(text(),'"+month+"')]/../following-sibling::div[@class='DayPicker-Body']/div/div/div/p[text()='"+date+"']")).click();
		
		System.out.println("test");
		
		
	}

}
