package org.sixAutomation.SDETTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleKeyboardActions extends LaunchApplication{
	
	@Test
	public void useKeaboardKeys() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		WebElement emailInputBox = driver.findElement(By.name("email"));
		emailInputBox.sendKeys("test@yopmail.com");
		emailInputBox.sendKeys(Keys.TAB);
		WebElement passwdInputBox = driver.findElement(By.name("passwd"));
		passwdInputBox.sendKeys("TestAuto");
		//passwdInputBox.submit();
		passwdInputBox.sendKeys(Keys.ENTER);
		
		System.out.println("Test");
		
	}

}
