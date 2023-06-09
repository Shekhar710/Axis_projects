package flipcartProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class mobileMenupagef {
	WebDriver driver;
	public mobileMenupagef(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/div[2]")
	public WebElement mobilesmenu;
	
	@FindBy(xpath = "//div[text()='SAMSUNG']")
	public WebElement samsung;
	
	@FindBy(xpath = "//div[text()='APPLE']")
	public WebElement apple;
	
	@FindBy(xpath = "//div[text()='realme']")
	public WebElement realme;

	
	
	public void checkBoxclick() {
		mobilesmenu.click();
		samsung.click();
		apple.click();
		realme.click();
		//Assert.assertTrue(selectedfilters.isDisplayed(), "selectedfilters Logo not displayed");
}

}