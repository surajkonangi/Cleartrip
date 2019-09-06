package com.cleartrip.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import com.cleartrip.oneway.TestDataProvider;
import com.cleartrip.oneway.flightreadproperties;

public class searchflight extends loginflight {
	//LogReports log=new LogReports();
	@Test(dataProvider = "destination", dataProviderClass = TestDataProvider.class, priority = 2)
	public void searchflight1(String[] values) throws IOException {
		//LogReports log=new LogReports();
		
		
		
		//BasicConfigurator.configure();
		
		flightreadproperties fb = new flightreadproperties();
		driver.findElement(By.xpath(fb.readPropertiesFile("searchpage.trip.txt"))).click();
	//	log.info("clicked");
		driver.findElement(By.xpath(fb.readPropertiesFile("searchpage.from.txt"))).sendKeys(values[0]);
		driver.findElement(By.xpath(fb.readPropertiesFile("searchpage.from.txt"))).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(fb.readPropertiesFile("searchpage.to.txt"))).sendKeys(values[1]);
		driver.findElement(By.xpath(fb.readPropertiesFile("searchpage.to.txt"))).sendKeys(Keys.ENTER);
		test.clickOnElement(driver, "//input[@id='DepartDate']");
		test.clickOnElement(driver, fb.readPropertiesFile("searchpage.depton.txt"));
		test.clickOnElement(driver, fb.readPropertiesFile("searchpage.returntab.txt"));
		test.clickOnElement(driver, fb.readPropertiesFile("searchpage.returndate.txt"));
		test.selectDropdown(fb.readPropertiesFile("searchpage.Adults.txt"), "1");
		test.selectDropdown(fb.readPropertiesFile("searchpage.Children.txt"), "1");
		test.selectDropdown(fb.readPropertiesFile("searchpage.Infants.txt"), "0");
		test.clickOnElement(driver, fb.readPropertiesFile("searchpage.searchFlight.txt"));
		// ClickElement(driver, fb.readPropertiesFile("searchpage.searchFlight.txt"));
		
	}

	
//public static void ClickElement(WebDriver driver, final String xpath) {
//	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).pollingEvery(1, TimeUnit.SECONDS)
//			.withTimeout(30, TimeUnit.SECONDS).ignoring(ElementNotInteractableException.class);
//	wait.until(new Function<WebDriver, Boolean>() {
//		public Boolean apply(WebDriver driver) {
//			driver.findElement(By.xpath(xpath)).click();
//			return true;
//		}
//	});
//}
}
