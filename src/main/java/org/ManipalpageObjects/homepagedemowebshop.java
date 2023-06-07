package org.ManipalpageObjects;
	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.WebElement;
	  import org.openqa.selenium.support.FindBy;
	  import org.openqa.selenium.support.PageFactory;
	  import org.testng.Assert;

	  public class homepagedemowebshop {

	  	WebDriver driver;

	  	public homepagedemowebshop(WebDriver driver) {
	  		this.driver = driver;
	  		PageFactory.initElements(driver, this);}

	  	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	  	public WebElement demowebshoplogo;
	  	@FindBy(linkText="Register")
	  	public WebElement registerbutton;
	  	@FindBy(linkText="Log in")
	  	public WebElement logoutbutton;
	 	@FindBy(xpath="(//*[text()='Shopping cart'])[1]")
	  	public WebElement shoppingcartbutton;
	 	@FindBy(xpath="(//*[text()='Wishlist'])[1]")
	  	public WebElement whislistbutton;


	  	public void verifyHomeLaunchSuccess() {
	  		System.out.println(demowebshoplogo.isDisplayed());
	  		Assert.assertTrue(demowebshoplogo.isDisplayed(), "demowebshoplogo is not Displayed");

	  		System.out.println(registerbutton.isDisplayed());
	  		Assert.assertTrue(registerbutton.isDisplayed(), "registerbutton is not	 Displayed");
	  		
	  		System.out.println(logoutbutton.isDisplayed());
	  		Assert.assertTrue(logoutbutton.isDisplayed(), "logoutbutton is not	 Displayed");
	  		
	  		System.out.println(shoppingcartbutton.isDisplayed());
	  		Assert.assertTrue(shoppingcartbutton.isDisplayed(), "shoppingcartbutton is not	 Displayed");
	  		
	  		System.out.println( whislistbutton.isDisplayed());
	  		Assert.assertTrue( whislistbutton.isDisplayed(), " whislistbutton is not	 Displayed");

	  	}

	  }


