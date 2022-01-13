package com.guru99.bankingproject.team_a_TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.guru99.bankingproject.team_a_Utility.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver = null;
	public static ReadConfig readConfig = null;
	public static String configDataPath = "./Config/config.properties";
	
	@BeforeSuite
	public void init() {
		
		readConfig = new ReadConfig(configDataPath);
		
	}
	@BeforeTest
	@Parameters({"browser","url"})
	public void setUp(@Optional("Chrome")String browser, @Optional("https://demo.guru99.com/V4/")String url) {
		
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver	= new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver	= new FirefoxDriver();
		}
		else if(browser.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver	= new InternetExplorerDriver();
		}
		
		else {
			System.out.println("Browser does not matched with expected browser launch");
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		}
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}

}
