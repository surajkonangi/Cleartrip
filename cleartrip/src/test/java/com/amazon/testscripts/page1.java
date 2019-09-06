package com.amazon.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.cleartrip.testscripts.searchflight;

public class page1 {
	WebDriver driver;

	@Test
	public void page() {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj.konangi\\eclipse-workspace\\cleartrip\\lib\\chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com");
		driver.manage().window().maximize();
}
	}
