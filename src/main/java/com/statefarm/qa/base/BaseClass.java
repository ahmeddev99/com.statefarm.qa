package com.statefarm.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.statefarm.qa.common.CommonActions;
import com.statefarm.qa.pages.LandingPage;
import com.statefarm.qa.pages.PopUpWindow;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	public static WebDriver driver;
	public LandingPage landingPage;
	public CommonActions commonActions;
	public PopUpWindow popUpWindow;
	
	
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
//		driver.quit();
	}
	
	
	public void initClasses() {
		landingPage = new LandingPage(driver);
		commonActions = new CommonActions();
		popUpWindow = new PopUpWindow(driver);
		
		
		
	}

}