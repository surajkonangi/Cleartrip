package com.cleartrip.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class test {
	static WebDriver driver;
	public static void selectDropdown(String xpath, String visibleText) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select noOfpeople = new Select(element);
		noOfpeople.selectByVisibleText(visibleText);

	}

	public static void clickOnElement(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();

	}
	public static void sendKeys(WebDriver driver, String xpath,String value) {
		driver.findElement(By.xpath(xpath)).sendKeys();

}
}
