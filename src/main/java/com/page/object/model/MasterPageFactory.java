package com.page.object.model;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {

	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@class='login']")
	private WebElement SignIn;
	
	@FindBy (xpath = "//*[@id='email']")
	private WebElement Email;
	
	@FindBy (xpath = "//*[@id='passwd']")
	private WebElement Password;
	
	@FindBy (xpath = "//*[@id='SubmitLogin']")
	private WebElement FinalSignIn;
	
	public WebElement getSignIn() {
		return SignIn;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getFinalSignIn() {
		return FinalSignIn;
	}
	
}
