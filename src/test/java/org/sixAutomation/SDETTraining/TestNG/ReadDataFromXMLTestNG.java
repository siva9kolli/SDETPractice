package org.sixAutomation.SDETTraining.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXMLTestNG {
	
	@Parameters(value = {"url"})
	@Test
	public void readdata(String test1) {
		System.out.println("Executing " + test1);
	}
	
	@Parameters(value = {"userName"})
	@Test
	public void readdata1(String test1) {
		System.out.println("Executing " + test1);
	}
	
	@Parameters(value = {"password"})
	@Test
	public void readdata2(String test1) {
		System.out.println("Executing " + test1);
	}

}
