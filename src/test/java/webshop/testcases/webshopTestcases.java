package webshop.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webshop.base.Baseconfigurationdemowebshop;
import webshopObjects.ComputerMenu;
import webshopObjects.DesktopPage;
import webshopObjects.HomePage;
import webshopObjects.ProductPage;

public class webshopTestcases extends Baseconfigurationdemowebshop {
	
	HomePage homeObj;
	ComputerMenu computerObj;
	DesktopPage desktopObj;
	ProductPage productObj;
	WebDriver driver;
	
	@BeforeClass
	public void initialSetup() {
		driver = getDriver();
		homeObj = new HomePage(driver);
		computerObj = new ComputerMenu(driver);
		desktopObj = new DesktopPage(driver);
		productObj = new ProductPage(driver);
		driver.manage().window().maximize();
	}
	
	@Test
	public void scenario1() {
		homeObj.verifyItems();
		computerObj.menuNavigation();
		desktopObj.buttonClick();
		productObj.verifyButton();
	}
	
}