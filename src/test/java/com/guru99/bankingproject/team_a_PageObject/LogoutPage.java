package com.guru99.bankingproject.team_a_PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.bankingproject.team_a_Utility.Helper;

public class LogoutPage {

	WebDriver driver;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Log out")
	WebElement logoutlink;

	public void logout() {
		logoutlink.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		if (Helper.isAlertPresent(driver)) {
			driver.switchTo().alert().accept();
		} else {
			System.out.println("alert is not present");
		}

	}

}
