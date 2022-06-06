package com.allstate.qa.tests;


import org.testng.annotations.Test;

import com.statefarm.qa.base.BaseClass;

public class AutoQuoteTest extends BaseClass {
	
	@Test
	public void AutoTest() {
		landingPage.inputZipCode(commonActions, "07457");
		landingPage.clickOnStartQuote(commonActions);
		popUpWindow.popWindowClick(commonActions);
		getYourQuotePage.inputFirstName(commonActions, "Jordan");
		getYourQuotePage.inputMiddlename(commonActions, 'R');
		getYourQuotePage.inputLastName(commonActions, "Pippen");
		getYourQuotePage.clickSuffix(commonActions);
		getYourQuotePage.selectSuffix(commonActions);
		getYourQuotePage.streetAddress(commonActions, "1 South Corporate Drive");
		getYourQuotePage.apartment(commonActions, "1C");
		getYourQuotePage.inputDOB(commonActions, "03231984");
		getYourQuotePage.clickVehicles(commonActions);
		
	}
}


