package org.Manipal.testcases;

import org.Manipal.base.Baseconfigurationdemowebshop;
import org.ManipalpageObjects.Addtocartdemowebshop;
import org.ManipalpageObjects.computersmenudemowebshop;
import org.ManipalpageObjects.homepagedemowebshop;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcasedemowebshop extends  Baseconfigurationdemowebshop {



	public homepagedemowebshop homepagedemopageObj;
	public computersmenudemowebshop computersmenudemowebshopObj;
	public Addtocartdemowebshop  addtocartdemowebshopObj;
	WebDriver driver;

	
	@BeforeClass
	public void initialiSetup() {
		driver = getDriver();
		 homepagedemopageObj = new homepagedemowebshop(driver);
		 computersmenudemowebshopObj = new computersmenudemowebshop(driver);
		 addtocartdemowebshopObj = new Addtocartdemowebshop(driver);

	}

	@Test
	public void scenario1() {
		 homepagedemopageObj.verifyHomeLaunchSuccess(); 
		computersmenudemowebshopObj.computermenuNavigation();
		addtocartdemowebshopObj.addtocartmenuNavigation();
	}

}
