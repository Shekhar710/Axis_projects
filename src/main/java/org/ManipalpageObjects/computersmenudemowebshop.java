  package org.ManipalpageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class computersmenudemowebshop {

	WebDriver driver;

	public computersmenudemowebshop(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath = "//body/div[4]/div[1]/div[2]/ul[1]/li[2]/a[1]")
	//public WebElement MobileComputerMenLbl;
	public WebElement computer;

	@FindBy(xpath = "//body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	//public WebElement allMobileLbl;
	public WebElement desktop;
	
	public void computermenuNavigation() {
		
		computer.click();
		desktop.click();
		
	}

}