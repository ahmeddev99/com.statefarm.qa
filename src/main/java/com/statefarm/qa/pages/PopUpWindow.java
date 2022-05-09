package com.statefarm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.statefarm.qa.common.CommonActions;

public class PopUpWindow {
	
	public PopUpWindow(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "billOfRightsModalCloseLinkId")
	WebElement popWindowElement;
	
	public void popWindowClick(CommonActions commonActions) {
		commonActions.click(popWindowElement);
	}
}
