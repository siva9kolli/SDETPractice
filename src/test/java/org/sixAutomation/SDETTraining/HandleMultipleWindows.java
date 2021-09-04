package org.sixAutomation.SDETTraining;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleMultipleWindows extends LaunchApplication{
	
	@Test
	public void verifySwitchingWindow() {
		driver.get("http://the-internet.herokuapp.com/windows");
		
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver);
		fWait.pollingEvery(Duration.ofSeconds(3));
		fWait.withTimeout(Duration.ofSeconds(15));
		fWait.ignoring(NoSuchElementException.class);
		WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow === " + parentWindow);
		
		fWait.until(ExpectedConditions.elementToBeClickable(clickHereLink)).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("allWindows === " + allWindows);
		
		for(String window : allWindows) {
			driver.switchTo().window(window);
		}
				
		
		Assert.assertTrue(driver.findElement(By.cssSelector("div > h3")).getText().equals("New Window"));
		driver.close();
		driver.switchTo().window(parentWindow);
		
		Assert.assertTrue(clickHereLink.isDisplayed());
	}
	
	
	
	

}
