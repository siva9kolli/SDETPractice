package org.sixAutomation.SDETTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleJSAlerts extends LaunchApplication{
	
	@Test
	public void acceptJSAlert() {
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		WebElement jsAlert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		wait.until(ExpectedConditions.elementToBeClickable(jsAlert));
		
		WebElement jsConfirm = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
		WebElement jsPrompt = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
		
		jsAlert.click();
		
		Alert alert = driver.switchTo().alert();
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(), "You successfully clicked an alert");
		
	}

}
