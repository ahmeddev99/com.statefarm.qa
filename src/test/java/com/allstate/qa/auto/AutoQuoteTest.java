package com.allstate.qa.auto;

import org.testng.annotations.Test;

import com.statefarm.qa.base.BaseClass;


public class AutoQuoteTest extends BaseClass {
	
	@Test
	public void AutoTest() {
		landingPage.inputZipCode(commonActions, "07457");
		landingPage.clickOnStartQuote(commonActions);
		popUpWindow.popWindowClick(commonActions);
		
		
	}

}
