package com.statefarm.qa.pages.home;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.statefarm.qa.base.BaseClass;
import com.statefarm.qa.common.CommonActions;

public class HomeOwnersQuote {
	
	public HomeOwnersQuote(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "firstName")
	WebElement firstNameElement;
	@FindBy(id = "lastName")
	WebElement lastNameElement;
	@FindBy(id = "middleName")
	WebElement middleNameElement;
	@FindBy(id = "nameSuffix")
	WebElement suffixElement;
	@FindBy(id = "street")
	WebElement streetAddressElement;
	@FindBy(id = "street2")
	WebElement suiteElement;
	@FindBy(id = "dateOfBirth")
	WebElement dateOfBirthElement;
//	@FindBy(id = "sameAsRiskAddress")
//	WebElement asAboveElement;
	@FindBy(id = "continue")
	WebElement continueElement;
	
	public void inputFirstName(CommonActions commonActions, String firstName) {
		commonActions.inputText(firstNameElement, firstName);
	}
	public void inputLastName(CommonActions commonActions, String lastName) {
		commonActions.inputText(lastNameElement, lastName);
	}
	public void inputMiddleName(CommonActions commonActions, char middleName) {
		commonActions.inputText(middleNameElement, middleName);
	}
	public void selectSuffix(CommonActions commonActions, String suffix) {
		commonActions.selectByValue(suffixElement, suffix);
	}
	public void inputStreet(CommonActions commonActions, String street) {
		commonActions.inputText(streetAddressElement, street);
	}
	public void inputSuiteNumber(CommonActions commonActions, String suite) {
		commonActions.inputText(suiteElement, suite);
	}
	public void dateOfBirth(CommonActions commonActions, String dob) {
		commonActions.inputText(dateOfBirthElement, dob);
	}
//	public void sameAsAbove(CommonActions commonActions) {
//		commonActions.click(asAboveElement);
//	}
	public void clickContinue(CommonActions commonActions) {
		
		JavascriptExecutor js = (JavascriptExecutor)BaseClass.driver;
		js.executeScript("arguments[0].scrollIntoView()", continueElement);
		commonActions.click(continueElement);
	}
	
	
	

}
