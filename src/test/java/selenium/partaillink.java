package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class partaillink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/chromedriver_win32/chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.get("https://www.calculator.net/calorie-calculator.html\"");
//driver.findElement(By.linkText("BMI")).click();
//driver.findElement(By.partialLinkText("Conception")).click();
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Images")).click();
	}

}
//public class partaillink {