package org.sixAutomation.SDETTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StaleElementExceptionUnderstanding extends LaunchApplication{
	
	@Test
	public void staleTest() {
		driver.get("https://www.prettylittlething.com/clothing/dresses.html?id=67&page=4&ajax=0");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement loadPage = driver.findElement(By.xpath("(//*[@class='load-more-btn'])[2]"));
		
		Assert.assertEquals(driver.findElement(By.xpath("(//*[@class='numberOfListerItemsDisplayed'])[2]")).getText(), "192");
		
		Actions action = new Actions(driver);
		action.moveToElement(loadPage).click().build().perform();
		
		Assert.assertEquals(driver.findElement(By.xpath("(//*[@class='numberOfListerItemsDisplayed'])[2]")).getText(), "240");
		
		action.moveToElement(loadPage).click().build().perform();
		
		
		action.moveToElement(loadPage).click().build().perform();
	}

}
