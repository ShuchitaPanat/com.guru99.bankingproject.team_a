package com.guru99.bankingproject.team_a_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {
	
	
	public Properties prop = null;
	
	public  ReadConfig(String configDataPath) {
		try {
			File fs = new File(configDataPath);
			FileInputStream fins = new FileInputStream(fs);
			prop = new Properties();
			prop.load(fins);
		
			
		} catch (Exception e) {
			System.out.println("File not found : "  +e.getMessage());
		}
	
		
	}
	public String getKeyValue(String keyname) {
		return prop.getProperty(keyname);
	}
	
	
	
	public String getUserName() {
		return prop.getProperty("UserID");
	}
	
	public String getpassword() {
		return prop.getProperty("Password");
	}
	public String getUrl() {
		return prop.getProperty("url");
	}

}
