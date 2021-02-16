package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model.MasterPageFactory;
import com.util.Highlighter;
import com.util.ScreenShot;
import com.util.SeleniumWait;
import com.util.UtilityPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationPractice {
	
	WebDriver driver;
	MasterPageFactory pf ;
	

	@Given("^Open the Browser$")
	public void openTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.gc();
		driver.getCurrentUrl();
		System.out.println("Setup Complete");
	}
	@When("Send URL")
	public void sendURL() {
		driver.get(UtilityPackage.getConfig("url"));
		//driver.get("http://automationpractice.com/index.php");
	}
	@When("Click SignIn Button")
	public void clickSignIn() {
		pf = new MasterPageFactory(driver);
		Highlighter.getHighlighter(driver, pf.getSignIn());
		SeleniumWait.getExplicitWait(driver, pf.getSignIn());
		ScreenShot.getScreenShot(driver);
		pf.getSignIn().click();
	}
	@When("Enter Valid Email")
	public void enter_Valid_Email() {
		Highlighter.getHighlighter(driver, pf.getEmail(), "red");
		SeleniumWait.getExplicitWait(driver, pf.getEmail());
		ScreenShot.getScreenShot(driver);
		pf.getEmail().sendKeys(UtilityPackage.getConfig("email"));	
	}
	@When("Enter Valid Password")
	public void enter_Valid_Password() {
		pf = new MasterPageFactory(driver);
		Highlighter.getHighlighter(driver, pf.getPassword(), "green");
		SeleniumWait.getExplicitWait(driver, pf.getPassword());
		ScreenShot.getScreenShot(driver);
		pf.getPassword().sendKeys(UtilityPackage.getConfig("password"));
	}
	@When("Click Finl SignIn Button")
	public void click_Finl_SignIn_Button() {
		pf = new MasterPageFactory(driver);
		Highlighter.getHighlighter(driver, pf.getFinalSignIn(), "blue");
		SeleniumWait.getExplicitWait(driver, pf.getFinalSignIn());
		ScreenShot.getScreenShot(driver);
		pf.getFinalSignIn().click();
		
	}
	@Then("Close Browser")
	public void closeBrowser() throws Throwable {
		Thread.sleep(300);
		driver.quit();
	}
}
