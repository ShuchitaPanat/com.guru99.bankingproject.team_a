package com.guru99.bankingproject.team_a_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver){
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(name="uid")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(name="btnLogin")
	WebElement loginBtn;

	public void setUserName(String uname) {
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void ClickOnLognBtn() {
		loginBtn.click();
	}
}
