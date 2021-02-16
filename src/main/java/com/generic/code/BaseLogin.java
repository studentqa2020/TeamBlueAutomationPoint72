package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model.MasterPageFactory;
import com.util.Highlighter;
import com.util.ScreenShot;
import com.util.UtilityPackage;

public class BaseLogin {

	public static WebDriver getSetUp() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(UtilityPackage.getConfig("url"));
		driver.manage().window().maximize();
		System.gc();
		System.out.println("Setup Complete");

		return driver;
	}

	public static WebDriver getLogin(WebDriver driver) {
		System.out.println("Test Started");

		MasterPageFactory pf = new MasterPageFactory(driver);

		Highlighter.getHighlighter(driver, pf.getSignIn());
		//SeleniumWait.getExplicitWait(driver, pf.getSignIn());
		ScreenShot.getScreenShot(driver);
		pf.getSignIn().click();
		
		Highlighter.getHighlighter(driver, pf.getEmail(), "red");
		//SeleniumWait.getExplicitWait(driver, pf.getEmail());
		ScreenShot.getScreenShot(driver);
		pf.getEmail().sendKeys(UtilityPackage.getConfig("email"));
		
		Highlighter.getHighlighter(driver, pf.getPassword(), "green");
		//SeleniumWait.getExplicitWait(driver, pf.getPassword());
		ScreenShot.getScreenShot(driver);
		pf.getPassword().sendKeys(UtilityPackage.getConfig("password"));
		
		Highlighter.getHighlighter(driver, pf.getFinalSignIn(), "blue");
		//SeleniumWait.getExplicitWait(driver, pf.getFinalSignIn());
		ScreenShot.getScreenShot(driver);
		pf.getFinalSignIn().click();

		driver.quit();
		return driver;
	}
}
