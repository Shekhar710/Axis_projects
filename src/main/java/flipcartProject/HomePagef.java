package flipcartProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePagef {
    WebDriver driver;
	
	public HomePagef(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
	public WebElement flipcartLogo; 
	
	@FindBy(xpath = "//button[contains(text(),'✕')]")
	public WebElement popup;
	
	
	public void verifyPage() {
		Assert.assertTrue(flipcartLogo.isDisplayed(), "flipcart Logo not displayed");
		popup.click();
	}

}