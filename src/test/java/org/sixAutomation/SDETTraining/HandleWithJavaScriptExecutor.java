package org.sixAutomation.SDETTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleWithJavaScriptExecutor extends LaunchApplication{
	
	//@Test
	public void useOnlyJSE() throws InterruptedException {
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement emailInputBox = driver.findElement(By.name("email"));
		WebElement passwdInputBox = driver.findElement(By.name("passwd"));
		WebElement loginButton = driver.findElement(By.cssSelector("#SubmitLogin"));
		
		jse.executeScript("arguments[0].value='test@yopmail.com'", emailInputBox);
		jse.executeScript("arguments[0].value='test@123'", passwdInputBox);
		jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",loginButton);
		
		jse.executeScript("arguments[0].click()", loginButton);
		
		//document.querySelector('#SubmitLogin')
		System.out.println("Test");
	}
	
	
	//@Test
	public void useOnlyQuerySelector() throws InterruptedException {
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("document.querySelector('#email').value='test@yopmail.com'");
		jse.executeScript("document.querySelector('#passwd').value='test@123'");
		jse.executeScript("document.querySelector('#SubmitLogin').setAttribute('style', 'background: yellow; border: 2px solid red;');");
		
		jse.executeScript("document.querySelector('#SubmitLogin').click()");
		
		//document.querySelector('#SubmitLogin')
		System.out.println("Test");
	}
	
	@Test
	public void useOnlyUsingID() throws InterruptedException {
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById('email').value='test@yopmail.com'");
		jse.executeScript("document.getElementById('passwd').value='test@123'");
		jse.executeScript("document.getElementById('SubmitLogin').setAttribute('style', 'background: yellow; border: 2px solid red;');");
		
		jse.executeScript("document.getElementById('SubmitLogin').click()");
		
		//document.querySelector('#SubmitLogin')
		System.out.println("Test");
	}

}
