package com.execution;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;

public class SmokeTest {
	static WebDriver driver;
public static void main(String[] args) {
	driver = BaseLogin.getSetUp();
	driver = BaseLogin.getLogin(driver);
	
	driver.quit();
	System.out.println("Run Successfull");
}
}
