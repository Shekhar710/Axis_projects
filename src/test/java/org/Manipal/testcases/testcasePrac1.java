package org.Manipal.testcases;

import java.net.MalformedURLException;

import org.Manipal.base.Baseconfigurationdemowebshop;
import org.ManipalpageObjects.Addtocartdemowebshop;
import org.ManipalpageObjects.computersmenudemowebshop;
import org.ManipalpageObjects.homepagedemowebshop;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import grid.Prac;
import grid.Prac1;

public class testcasePrac1 extends  Prac1 {



	public homepagedemowebshop homepagedemopageObj;
	public computersmenudemowebshop computersmenudemowebshopObj;
	public Addtocartdemowebshop  addtocartdemowebshopObj;
	WebDriver driver;

	@Parameters({"Port"})
	@BeforeClass
	public void setup(String Port) throws MalformedURLException {
		driver = setUp(Port);
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