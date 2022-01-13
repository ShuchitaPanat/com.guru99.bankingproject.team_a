package com.guru99.bankingproject.team_a_TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.bankingproject.team_a_PageObject.LoginPage;
import com.guru99.bankingproject.team_a_PageObject.LogoutPage;
import com.guru99.bankingproject.team_a_TestBase.TestBase;

public class LogoutTC extends TestBase {

	@Test
	
	public void logouttoguru99() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(readConfig.getKeyValue("uid"));
		lp.setPassword(readConfig.getKeyValue("pwd"));
		lp.ClickOnLognBtn();
		
		 LogoutPage hp = new LogoutPage(driver);
		 hp.logout();
	
	//if(driver.findElement(By.xpath("//h2[contains(text(),'Guru99 Bank')]")).isDisplayed()) {
		if (driver.getPageSource().contains("frmLogin")) {
		Assert.assertTrue(true);
		System.out.println("logged out successfully");
		
	}
	else {
		Assert.assertTrue(false, "login form is visible");
		System.out.println("logging out failed");
	}
		
	}
}
