package org.sixAutomation.SDETTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleVsMultipleElements extends LaunchApplication{
	
	@Test
	public void verifyDuplicateElements() {
		driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement addButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
		
		addButton.click();
		
		WebElement deleteButton = driver.findElement(By.cssSelector(".added-manually"));
		
		Assert.assertTrue(deleteButton.isDisplayed());
		
		
		for(int i=0; i<4; i++) {
			addButton.click();
		}
		List<WebElement> deleteButtons = driver.findElements(By.cssSelector(".added-manually"));
		System.out.println("deleteButtons == " + deleteButtons);
		System.out.println("deleteButtons.size == " + deleteButtons.size());
		
		Assert.assertEquals(deleteButtons.size(),  5);
		
		for(int i=0; i<deleteButtons.size(); i++ ) {
			deleteButtons.get(i).click();
		}
		
		System.out.println("deleteButtons.size() === " + driver.findElements(By.cssSelector(".added-manually")).size());
		System.out.println("deleteButtons === " + driver.findElements(By.cssSelector(".added-manually")));
		
		Assert.assertEquals(driver.findElements(By.cssSelector(".added-manually")).size(),  0);
	}
	
	public WebElement getEleement() {
		return driver.findElement(By.xpath(""));
	}
	
	public List<WebElement> getListOfElements(){
		return driver.findElements(By.xpath(""));
	}

}
