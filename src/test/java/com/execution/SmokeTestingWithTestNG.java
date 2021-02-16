package com.execution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;

public class SmokeTestingWithTestNG {
	WebDriver driver;
	
	@BeforeTest
	public void getDriverSetup() {
		driver = BaseLogin.getSetUp();
	}
	@Test
	public void getTest() {
		driver = BaseLogin.getLogin(driver);
	}
	@AfterTest
	public void getClose() {
		driver.quit();
	}
	

}
