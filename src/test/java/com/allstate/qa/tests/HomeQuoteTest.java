package com.allstate.qa.tests;

import org.testng.annotations.Test;

import com.statefarm.qa.base.BaseClass;

public class HomeQuoteTest extends BaseClass {

	@Test
	public void homeQuoteTest() {
		landingHomePage.selectProduct(commonActions, "Homeowners");
		landingHomePage.inputZipCode(commonActions, "07424");
		landingHomePage.clickOnStartQuote(commonActions);
		homeOwnersQuote.inputFirstName(commonActions, "Pippen");
		homeOwnersQuote.inputLastName(commonActions, "Jordan");
		homeOwnersQuote.inputMiddleName(commonActions, 'R');
		homeOwnersQuote.selectSuffix(commonActions, "II");
		homeOwnersQuote.inputStreet(commonActions, "12 Pompton Ave");
		homeOwnersQuote.inputSuiteNumber(commonActions, "1st Fl");
		homeOwnersQuote.dateOfBirth(commonActions, "11/15/1985");
		homeOwnersQuote.clickContinue(commonActions);
		yourLocationPage.fireProtection(commonActions, "WEST PATERSON");
		yourLocationPage.fireContinue(commonActions);
	}
	

	
	
	
	
	
	
	
}