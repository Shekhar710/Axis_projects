package flipcartProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class removeFiltersf {
	WebDriver driver;
	public removeFiltersf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[2]")
	public WebElement samsungButton;
	
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[2]")
	public WebElement appleButton;
	
	@FindBy(xpath = "//*[text()='realme']")
	public WebElement realmeButton;
;

	
	public void buttonClicks() {
		
		samsungButton.click();
		appleButton.click();
		realmeButton.click();

	}
	}