package com.allstate.qa.tests;

import org.testng.annotations.Test;

import com.statefarm.qa.base.BaseClass;

public class HomeQuoteTest extends BaseClass {

	@Test
	public void homeQuoteTest() {
		landingHomePage.selectProduct(commonActions, "Homeowners");
		landingHomePage.inputZipCode(commonActions, "10008");
		landingHomePage.clickOnStartQuote(commonActions);
//		homeOwnersQuote.displayYourName(commonActions, "What is your name");
		homeOwnersQuote.inputFirstName(commonActions, "Pippen");
		homeOwnersQuote.inputLastName(commonActions, "Jordan");
		homeOwnersQuote.inputMiddleName(commonActions, 'R');
		homeOwnersQuote.selectSuffix(commonActions, "II");
		homeOwnersQuote.inputStreet(commonActions, "2 Gold Street");
		homeOwnersQuote.inputSuiteNumber(commonActions, "23-33");
		homeOwnersQuote.dateOfBirth(commonActions, "05/23/1999");
		homeOwnersQuote.sameAsAbove(commonActions);
//		homeOwnersQuote.inputMalingAddress(commonActions, "90 John Street");
//		homeOwnersQuote.inputMalingCity(commonActions, "New York");
//		homeOwnersQuote.inputMalingsuit(commonActions, "33");
//		homeOwnersQuote.inputMalingZipCode(commonActions, "10038");
//		homeOwnersQuote.clickContinue(commonActions);
		homeOwnersQuote.consumerReport(commonActions, "Disclosures");
		homeOwnersQuote.noticePrivacy(commonActions, "Notice of Privacy Policy");
//		homeOwnersQuote.clickContinue(commonActions);
	}
	

	
	
	
	
	
	
	
}