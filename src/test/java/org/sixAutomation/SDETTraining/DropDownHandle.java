package org.sixAutomation.SDETTraining;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownHandle extends LaunchApplication{
	
	@Test
	public void selectCountryFromDropDown() {
		WebElement countyDropDown = driver.findElement(By.name("CompanyCountry"));
		
		Select selectValue = new Select(countyDropDown);
		
		selectValue.selectByIndex(230);
		selectValue.selectByValue("BH");
		selectValue.selectByVisibleText("India");
		System.out.println("Test");
		
		WebElement selectedOption = selectValue.getFirstSelectedOption();
		String valueOfFirstSelectedOption = selectedOption.getText();
		
		System.out.println("valueOfFirstSelectedOption === " + valueOfFirstSelectedOption);
		
		Assert.assertEquals(valueOfFirstSelectedOption, "India");
		
		List<WebElement> numberOfOptions = selectValue.getOptions();
		
		System.out.println("numberOfOptions === "+ numberOfOptions.size());
		
		// Will cover in Java Session
		List<String> allCountries = new ArrayList<String>();
		
		for(int i=0; i<numberOfOptions.size(); i++ ) {
			allCountries.add(numberOfOptions.get(i).getText());	
		}
		
		System.out.println("allCountries == " + allCountries);
	}
	
	

}
