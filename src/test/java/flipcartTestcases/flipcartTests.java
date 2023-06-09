package flipcartTestcases;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import flipcartProject.HomePagef;
import flipcartProject.mobileMenupagef;
import flipcartProject.removeFiltersf;
import flipcartgrid.Practical;

public class flipcartTests extends  Practical {



	public HomePagef homepageObj;
	public mobileMenupagef mobileMenupageObj;
	public removeFiltersf  removeFiltersObj;
	WebDriver driver;

	@Parameters({"Port"})
	@BeforeClass
	public void setup(String Port) throws MalformedURLException {
		driver = setUp(Port);
		homepageObj = new HomePagef (driver);
		mobileMenupageObj = new mobileMenupagef(driver);
		removeFiltersObj = new removeFiltersf(driver);

	}

	@Test
	public void scenario1() {
		homepageObj.verifyPage(); 
		mobileMenupageObj.checkBoxclick();
		removeFiltersObj.buttonClicks();
	}

}