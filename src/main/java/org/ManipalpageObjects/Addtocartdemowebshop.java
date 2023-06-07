  package org.ManipalpageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Addtocartdemowebshop {

	WebDriver driver;

	public Addtocartdemowebshop(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	//@FindBy(xpath = "//img[@title='Show details for Build your own cheap computer']")
	//public WebElement MobileComputerMenLbl;
//	public WebElement clickonproductLbl;

	@FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")
	public WebElement addtocartlbl;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button-72']")
	//public WebElement MobileComputerMenLbl;
	public WebElement addtocartpageLbl;

	public void addtocartmenuNavigation() {
		
		//clickonproductLbl.click();
		addtocartlbl.click();
  		System.out.println(addtocartpageLbl.isDisplayed());
  		Assert.assertTrue(addtocartpageLbl.isDisplayed(), "addtocartpageLbl is not	 Displayed");
}}