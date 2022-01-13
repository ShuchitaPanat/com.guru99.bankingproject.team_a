package com.guru99.bankingproject.team_a_TestCase;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.bankingproject.team_a_PageObject.LoginPage;
import com.guru99.bankingproject.team_a_TestBase.TestBase;

public class LoginTC extends TestBase {
	@Test
	
	public void logintoguru99()  {
		System.out.println("logintoguru99 Test Case");
		
		LoginPage lp = new LoginPage(driver);	
		
		lp.setUserName("mngr341390");
		lp.setPassword("vYmajuh");
		lp.ClickOnLognBtn();
		
		
		
		
		String hpTitle = driver.getTitle();
		System.out.println(hpTitle);
		
		 if (driver.findElement(By.xpath("//marquee[contains(text(),"
		 	+ "\"Welcome To Manager's Page of Guru99 Bank\")]")).isDisplayed()) {
			 Assert.assertTrue(true);
			 System.out.println("Welcome To Manager's Page of Guru99 Bank");
		 }else {
			 Assert.assertTrue(false,"Homepage is not visible");
			 System.out.println("Unsuccessful login");
		 }
		 
		 
		driver.quit();
		

	}
}







