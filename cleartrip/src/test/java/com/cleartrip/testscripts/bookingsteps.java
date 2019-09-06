package com.cleartrip.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.cleartrip.oneway.TestDataProvider;
import com.cleartrip.oneway.flightreadproperties;

public class bookingsteps extends bookflight 
{
	
	@Test(dataProvider = "destination", dataProviderClass = TestDataProvider.class,priority = 4)
	public void bookingsteps(String[] values) throws IOException, InterruptedException 
	{   
		flightreadproperties fb = new flightreadproperties();
		Thread.sleep(5000);
		driver.findElement(By.xpath(fb.readPropertiesFile("Itinerarystep.Insurance.txt"))).click();
		driver.findElement(By.xpath(fb.readPropertiesFile("Itinerarystep.ContinueDetails.txt"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(fb.readPropertiesFile("emailstep.EmailId.txt")))
				.sendKeys(values[2]);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				driver.findElement(By.xpath(fb.readPropertiesFile("emailstep.Continue.txt"))));
		Thread.sleep(5000);
		test.selectDropdown(fb.readPropertiesFile("travellerstep.Title.txt"), "Mr");
		driver.findElement(By.xpath(fb.readPropertiesFile("travellerstep.FirstName.txt"))).sendKeys(values[3]);
		driver.findElement(By.xpath(fb.readPropertiesFile("travellerstep.LastName.txt"))).sendKeys(values[4]);
		test.selectDropdown(fb.readPropertiesFile("locators.textarea.Title"), "Mstr");
		driver.findElement(By.xpath(fb.readPropertiesFile("travellerstep.childFirstName.txt"))).sendKeys(values[5]);
		driver.findElement(By.xpath(fb.readPropertiesFile("travellerstep.childLastName.txt"))).sendKeys(values[6]);
		test.selectDropdown(fb.readPropertiesFile("locators.textarea.Day.txt"), "5");
		test.selectDropdown(fb.readPropertiesFile("locators.textarea.Month.txt"), "Jan");
		test.selectDropdown(fb.readPropertiesFile("locators.textarea.year.txt"), "2015");
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.Mobileno.txt"))).sendKeys(values[7]);
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.Continue.txt"))).click();
		driver.quit();
	}

}
