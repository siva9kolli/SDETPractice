package org.sixAutomation.SDETTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesHandle extends LaunchApplication{
	
	//@Test
	public void switchingToIFrame() {
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		WebElement frameElement = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameElement);
		WebElement editorInput = driver.findElement(By.cssSelector(".mce-content-body"));
		
		Assert.assertTrue(editorInput.isDisplayed());
		
		editorInput.clear();
		editorInput.sendKeys("Hello Selenium guys");
	}
	
	
	@Test
	public void switchingToInnerFrames() {
		driver.get("http://the-internet.herokuapp.com/nested_frames");
	
		
		WebElement topFrame = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(topFrame);
		System.out.println("Switched to Parent Frame - TOP");
		
		WebElement leftFrame = driver.findElement(By.name("frame-left"));
		
		driver.switchTo().frame(leftFrame);
		
		System.out.println("Switched to Child Frame - Left");
		
		String leftFrameText = driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
		System.out.println("Text -- " + leftFrameText);
		
		Assert.assertEquals(leftFrameText, "LEFT");
		
		driver.switchTo().parentFrame();
		System.out.println("Switched to Parent Frame - TOP");
		
		driver.switchTo().frame("frame-middle");
		System.out.println("Switched to Child Frame - MIDDLE");
		
		
		String middleFrameText = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		
		Assert.assertEquals(middleFrameText, "MIDDLE");
		
		driver.switchTo().defaultContent();
		
		WebElement bottomframe = driver.findElement(By.name("frame-bottom"));
		driver.switchTo().frame(bottomframe);
		
		System.out.println("Switched to Unique Frame - BOTTOM");
		
		String bottomFrameText = driver.findElement(By.xpath("//body[normalize-space()='BOTTOM']")).getText();
		System.out.println("Text -- " + bottomFrameText);
		
		Assert.assertEquals(bottomFrameText, "BOTTOM");
		
		
	}
	

}
