package com.statefarm.qa.pages.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.statefarm.qa.common.CommonActions;

public class LandingAutoPage {
	
	public LandingAutoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "quote-main-zip-code-input")
	WebElement zipCodeElement;
	@FindBy(id = "quote-main-zip-btn")
	WebElement startAQuoteElement;
	
	public void inputZipCode(CommonActions commonActions, String zipcode) {
		commonActions.inputText(zipCodeElement, zipcode);
	}
	public void clickOnStartQuote(CommonActions commonActions) {
		commonActions.click(startAQuoteElement);
	}
}
