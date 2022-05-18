package com.statefarm.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.statefarm.qa.common.CommonActions;
import com.statefarm.qa.pages.auto.GetYourQuotePage;
import com.statefarm.qa.pages.auto.LandingAutoPage;
import com.statefarm.qa.pages.auto.PopUpWindowPage;
import com.statefarm.qa.pages.home.LandingHomePage;
import com.statefarm.qa.pages.home.YourLocationPage;
import com.statefarm.qa.pages.home.HomeOwnersQuote;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	public static WebDriver driver;
	public CommonActions commonActions;
	public LandingAutoPage landingPage;
	public PopUpWindowPage popUpWindow;
	public GetYourQuotePage getYourQuotePage;
	public LandingHomePage landingHomePage;
	public HomeOwnersQuote homeOwnersQuote;
	public YourLocationPage yourLocationPage;
	
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.statefarm.com");
		initClasses();
	}
	
	@AfterMethod
	public void cleaningUp() {
		driver.quit();
	}
	
	
	public void initClasses() {
		landingPage = new LandingAutoPage(driver);
		commonActions = new CommonActions();
		popUpWindow = new PopUpWindowPage(driver);
		getYourQuotePage = new GetYourQuotePage(driver);
		landingHomePage = new LandingHomePage(driver);
		homeOwnersQuote = new HomeOwnersQuote(driver);
		yourLocationPage = new YourLocationPage(driver);
	}

}