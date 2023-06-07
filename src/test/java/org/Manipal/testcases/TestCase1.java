package org.Manipal.testcases;

import org.Manipal.base.baseconfiguration;
import org.ManipalpageObjects.Homepage;
import org.ManipalpageObjects.Menupage;
import org.ManipalpageObjects.MobilePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 extends baseconfiguration {


	// 1. Declare page Objects
	// 2. we will initialize the page object
	// 3. implement inherietnce concept
	// 4. Create Test case
	// 5. Create Webdriver reference

	/*
	 * HomePage homeObj=new HomePage(); 
	 * MenuPage menuObj=new MenuPage(); MobilePage
	 * mobileObj=new MobilePage();
	 */

	/* declaration of the Page objects */

	public Homepage homeObj;
	public Menupage menuObj;
	public MobilePage mobileObj;
	WebDriver driver;

	
	/* gave the memory to pageObjects */
	@BeforeMethod
	public void initialiSetup() {
		driver = getDriver();
		homeObj = new Homepage(driver);
		menuObj = new Menupage(driver);
		mobileObj = new MobilePage(driver);

	}

	/* TestCase */
	@Test
	public void scenario1() {
		homeObj.verifyHomeLaunchSuccess(); 
		menuObj.menuNavigation();
		mobileObj.verifyMobileHeader();
	}

}
