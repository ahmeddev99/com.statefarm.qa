package com.statefarm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.statefarm.qa.common.CommonActions;

public class GetYourQuotePage {
	
	public GetYourQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	WebElement firstNameElement;
	@FindBy(xpath = "//input[@id='middle_name']")
	WebElement middleNameElement;
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastNameElement;
	@FindBy(xpath = "//span[@class='ui-selectmenu-icon ui-icon chevron']")
	WebElement suffixElement;
	@FindBy(id = "ui-id-7")
	WebElement suffixSelectElement;
	@FindBy(id = "street1")
	WebElement streetAddressElement;
	@FindBy(id = "street2")
	WebElement apartmentElement;
//	@FindBy(id = "city")   // if i want to change to different city (next 4 lines)
//	WebElement clearCityElement;
//	@FindBy(id = "city")
//	WebElement cityElement;
	@FindBy(id = "date_of_birth")
	WebElement dobElement;
	@FindBy(xpath = "(//button[@class='uitk-btn-primary'])[2]")
	WebElement vehiclesElement;


	
	public void inputFirstName(CommonActions commonActions, String firstName) {
		commonActions.inputText(firstNameElement, firstName);
	}
	public void inputMiddlename(CommonActions commonActions, char middleName) {
		commonActions.inputText(middleNameElement, middleName);
	}
	public void inputLastName(CommonActions commonActions, String lastName) {
		commonActions.inputText(lastNameElement, lastName);
	}
	public void clickSuffix(CommonActions commonActions) {
		commonActions.click(suffixElement);
	}
	public void selectSuffix(CommonActions commonActions) {
		commonActions.click(suffixSelectElement);
	}
	public void streetAddress(CommonActions commonActions, String streetAddress) {
		commonActions.inputText(streetAddressElement, streetAddress);
	}
	public void apartment(CommonActions commonActions, String apartmentUnit) {
		commonActions.inputText(apartmentElement, apartmentUnit);
	}
//	public void clearCity(CommonActions commonActions) {    // if i want to change to different city (next 6 lines)
//		commonActions.clear(clearCityElement);
//	}
//	public void inputCity(CommonActions commonActions, String city) {
//		commonActions.inputText(cityElement, city);
//	}
	public void inputDOB(CommonActions commonActions, String dateOfBirth) {
		commonActions.inputText(dobElement, dateOfBirth);
	}
	public void clickVehicles(CommonActions commonActions) {
		commonActions.click(vehiclesElement);
	}

	
	

}
