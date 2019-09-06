package com.cleartrip.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class loginflight {
	WebDriver driver;
	//LogReports logger=new LogReports();

	@Parameters("selectBrowser")
	@Test(priority = 1)
	public void loginflight1(String selectBrowser) {

		switch (selectBrowser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//logger.info("chrome started...");
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
			driver = new FirefoxDriver();
			//logger.info("firefox started...");
			driver.manage().window().maximize();
			break;

		}  
		driver.get("http://www.cleartrip.com");
	}
}