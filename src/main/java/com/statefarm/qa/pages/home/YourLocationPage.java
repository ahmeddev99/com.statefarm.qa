package com.statefarm.qa.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.statefarm.qa.common.CommonActions;

public class YourLocationPage {
	
	public YourLocationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "fireProtectionAreaNameSelectId")
	WebElement fireProtectionElement;
	@FindBy(xpath = "//button[@id='continue']")
	WebElement fireContinueElement;
	
	public void fireProtection(CommonActions commonActions, String fire) {
		commonActions.selectByValue(fireProtectionElement, fire);
	}
	public void fireContinue(CommonActions commonActions) {
		commonActions.click(fireContinueElement);
	}


}
