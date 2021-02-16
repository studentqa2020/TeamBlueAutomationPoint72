package com.CrossBrowserTestNG.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.util.UtilityPackage;



public class CrossBrowserTesting {

	@Test
	@Parameters(value="Browser")
	public void getMyBrowser(String value) {
		System.out.println(value);

		if (value.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver1.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(UtilityPackage.getConfig("url"));
			driver.manage().window().maximize();
			System.out.println("Chrome Browser Open");
			driver.quit();
			
		} else if (value.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get(UtilityPackage.getConfig("url"));
			driver.manage().window().maximize();
			System.out.println("IE Browser Open");
			driver.quit();
			
		}else if(value.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "./path");
			WebDriver driver = new FirefoxDriver();
			driver.get(UtilityPackage.getConfig("url"));
			driver.manage().window().maximize();
			System.out.println("FireFox Browser Open");
			driver.quit();
			
		}else {
			System.out.println("Browser not Found");
		}

	}
}
