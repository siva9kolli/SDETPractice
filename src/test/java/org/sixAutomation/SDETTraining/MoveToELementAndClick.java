package org.sixAutomation.SDETTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToELementAndClick extends LaunchApplication{
	
	@Test
	public void selectSubMenuItem() {
		
		driver.get("http://the-internet.herokuapp.com/hovers");
		
		
		WebElement mainMenu = driver.findElement(By.cssSelector("img[alt='User Avatar']"));
		WebElement subMenu = driver.findElement(By.cssSelector("a[href='/users/1']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mainMenu).build().perform();
		action.moveToElement(subMenu).click().build().perform();
		
		System.out.println("Test");
		
		//Signature handling 
		
	}

}
