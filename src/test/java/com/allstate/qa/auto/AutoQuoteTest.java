package com.allstate.qa.auto;


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
//		getYourQuotePage.clearCity(commonActions);             // if i want to change city
//		getYourQuotePage.inputCity(commonActions, "Bulter");  //  <--- to this
		getYourQuotePage.inputDOB(commonActions, "03231984");
		getYourQuotePage.clickVehicles(commonActions);
		
		
		
		
		
		
		
		
		
		
	}
}
