package com.statefarm.qa.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.statefarm.qa.common.CommonActions;

public class HomeOwnersQuote {
	
	public HomeOwnersQuote(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath = "//h2[text()='What is your name?']")
//	WebElement yourNameElement;
	@FindBy(id = "firstName")
	WebElement firstNameElement;
	@FindBy(id = "lastName")
	WebElement lastNameElement;
	@FindBy(id = "middleName")
	WebElement middleNameElement;
	@FindBy(id = "nameSuffix")
	WebElement suffixElement;
	
//	public void displayYourName(CommonActions commonActions, String value) {
//		commonActions.getText(yourNameElement, value);
//	}
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
	
	
	@FindBy(id = "street")
	WebElement streetAddressElement;
	@FindBy(id = "street2")
	WebElement suiteElement;
	@FindBy(id = "dateOfBirth")
	WebElement dateOfBirthElement;
	@FindBy(id = "sameAsRiskAddress")
	WebElement asAboveElement;
	@FindBy(id = "sameAsRiskAddress")
	WebElement sameAsAboveElement;
	
	public void inputStreet(CommonActions commonActions, String street) {
		commonActions.inputText(streetAddressElement, street);
	}
	public void inputSuiteNumber(CommonActions commonActions, String suite) {
		commonActions.inputText(suiteElement, suite);
	}
	public void dateOfBirth(CommonActions commonActions, String dob) {
		commonActions.inputText(dateOfBirthElement, dob);
	}
	public void sameAsAbove(CommonActions commonActions) {
		commonActions.click(asAboveElement);
	}
	public void sameAsAbove2(CommonActions commonActions) {
		commonActions.click(sameAsAboveElement);
	}
	
//	@FindBy(id = "mailingAddressStreet")
//	WebElement mailingAddressElement;
//	@FindBy(id = "mailingAddressCity")
//	WebElement mailingCityElement;
//	@FindBy(id = "mailingAddressStreet2")
//	WebElement mailingsuiteElement;
//	@FindBy(id = "mailingAddressZipCode")
//	WebElement mailingZipCodeElement;
//	
//	public void inputMalingAddress(CommonActions commonActions, String mStreet) {
//		commonActions.inputText(mailingAddressElement, mStreet);
//	}
//	public void inputMalingCity(CommonActions commonActions, String mCity) {
//		commonActions.inputText(mailingCityElement, mCity);
//	}
//	public void inputMalingsuit(CommonActions commonActions, String mSuite) {
//		commonActions.inputText(mailingsuiteElement, mSuite);
//	}
//	public void inputMalingZipCode(CommonActions commonActions, String mZipCode) {
//		commonActions.inputText(mailingZipCodeElement, mZipCode);
//	}
	
	@FindBy(id = "consumerReportsHeader")
	WebElement consumerReportElement;
	
	public void consumerReport(CommonActions commonActions, String report) {
		commonActions.getText(consumerReportElement, report);
	}
	
	@FindBy(id = "Notice-of-Privacy-Policy")
	WebElement noticeElement;
	
	public void noticePrivacy(CommonActions commonActions, String notice) {
		commonActions.getText(noticeElement, notice);
	}
	
		
	@FindBy(css = "btn.btn-primary.btn-large.right")
	WebElement continueElement;
	
	public void clickContinue(CommonActions commonActions) {
		commonActions.click(continueElement);
	}
	
	
	

}
