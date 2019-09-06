package com.cleartrip.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.cleartrip.oneway.flightreadproperties;

public class bookflight extends searchflight {
	@Test(priority = 3)
	public void bookflight1() throws IOException, InterruptedException {

		flightreadproperties fb = new flightreadproperties();
//		Thread.sleep(10000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();",
//		driver.findElement(By.xpath(fb.readPropertiesFile("selectflightpage.book.txt"))));
		ClickElement(driver, fb.readPropertiesFile("selectflightpage.book.txt"));
	}

	public static void ClickElement(WebDriver driver, final String xpath) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).pollingEvery(1, TimeUnit.SECONDS)
				.withTimeout(30, TimeUnit.SECONDS).ignoring(ElementNotInteractableException.class);
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				driver.findElement(By.xpath(xpath)).click();
				return true;
			}
		});
	}
}