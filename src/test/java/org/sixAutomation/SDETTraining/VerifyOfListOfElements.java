package org.sixAutomation.SDETTraining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOfListOfElements extends LaunchApplication{
	
	@Test
	public void verifyListOfElements() throws InterruptedException {
		
		List<WebElement> menuItemWebElements = driver.findElements(By.xpath("//ul[@class='leftmenu']/child::li/a"));
		System.out.println("menuItemWebElements == " + menuItemWebElements);
		
		List<String> menuItemNames = new ArrayList<String>();
		
		for(int i=0; i<menuItemWebElements.size(); i++ ) {
			menuItemNames.add(menuItemWebElements.get(i).getText());
		}
		
		System.out.println("menuItemNames === " + menuItemNames);
		
		Iterator itr = menuItemNames.iterator();
		
		while(itr.hasNext()) {
			System.out.println("menuItemNames == " + itr.next());
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='leftmenu']/li/a[contains(@href,'services.htm')]")).click();
		
		List<WebElement> servicesMenuItemWebElements = driver.findElements(By.xpath("//ul[@class='leftmenu']/child::li/a"));
		
		List<String> servicesMenuItemNames = new ArrayList<String>();
		
		for(int i=0; i<servicesMenuItemWebElements.size(); i++ ) {
			servicesMenuItemNames.add(servicesMenuItemWebElements.get(i).getText());
		}
		
		System.out.println("servicesMenuItemNames === " + servicesMenuItemNames);
		
		Assert.assertEquals(menuItemNames, servicesMenuItemNames);
		
		
	}

}
