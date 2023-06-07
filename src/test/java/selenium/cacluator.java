package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cacluator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
	/*	Thread.sleep(1000);
		driver.findElement(By.name("cage")).clear();
		driver.findElement(By.name("cage")).sendKeys("22");
		driver.findElement(By.name("chieghtmeter")).clear();
		driver.findElement(By.name("chieghtmeter")).sendKeys("100");
		driver.findElement(By.name("ckg")).clear();
		driver.findElement(By.name("ckg")).sendKeys("30");
		driver.findElement(By.name("cpounds")).clear();
		driver.findElement(By.name("cpounds")).sendKeys("20");
		driver.findElement(By.name("calculate")).click(); */
		driver.findElement(By.id("cage")).clear();
	   	driver.findElement(By.id("cage")).sendKeys("22");
	  	driver.findElement(By.id("cheightmeter")).clear();
	   	driver.findElement(By.id("cheightmeter")).sendKeys("180");
	   	driver.findElement(By.id("ckg")).clear();
	   	driver.findElement(By.id("ckg")).sendKeys("60");
	}

}
