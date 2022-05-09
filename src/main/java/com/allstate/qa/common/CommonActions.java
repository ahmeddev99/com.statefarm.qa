package com.allstate.qa.common;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.allstate.qa.base.BaseClass;




public class CommonActions {
	
	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(20));
	

	public void click(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			Reporter.log("Element is clicking : " + element + "<br>");
		} catch (Exception e) {
			e.printStackTrace(); // <--same thing as System.out.println():
			Reporter.log("Element is unable to click: " + element + "\n" + e.getMessage() + "<br>");
			Assert.fail();  
		}
	}
	
	public void inputText(WebElement element, String text) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
			Reporter.log(text + " : value passed to element : " + element + "<br>");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Element is not found : " + element + "\n" + e.getMessage() + "<br>");
			Assert.fail();
		}
	}
	
	public void inputText(WebElement element, char text) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(String.valueOf(text));
			Reporter.log(text +" : value passed to element : " + element + "<br>");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Element is not found : " + element+"\n" + e.getMessage() + "<br>");
			Assert.fail();
		}
	}
	
	public void selectDropDown(WebElement element, String value) {
		try {
			// BaseClass.waits.waitUntilSelectable(element);
			Select select = new Select(element);
			select.selectByValue(value);
			Reporter.log(value + " : has been selected for element, " + element);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log(element + " Element Not Found \n" + e.getLocalizedMessage());
			Assert.fail();
		}
	}
	
}
	
	