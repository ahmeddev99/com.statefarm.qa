package com.statefarm.qa.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.statefarm.qa.common.CommonActions;

public class LandingHomePage {
	
	public LandingHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "popDropdown")
	WebElement productElement;
	@FindBy(id = "quote-main-zip-code-input")
	WebElement zipCodeElement;
	@FindBy(id = "quote-main-zip-btn")
	WebElement startAQuoteElement;
	
	public void selectProduct(CommonActions commonActions, String homeProduct) {
		commonActions.selectByValue(productElement, homeProduct);
	}
	public void inputZipCode(CommonActions commonActions, String zipcode) {
		commonActions.inputText(zipCodeElement, zipcode);
	}
	public void clickOnStartQuote(CommonActions commonActions) {
		commonActions.click(startAQuoteElement);
	}
}
