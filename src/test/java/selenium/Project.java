package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.saucedemo.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("remove-sauce-labs-onesie")).click();
		driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']")).click();
		driver.findElement(By.xpath("//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("jethalal");
		driver.findElement(By.id("last-name")).sendKeys("gada");
		driver.findElement(By.id("postal-code")).sendKeys("400105");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//*[text()='Checkout: Overview']")).isDisplayed();
		driver.findElement(By.xpath("//*[text()='Payment Information']")).isDisplayed();
		driver.findElement(By.xpath("//*[text()='Shipping Information']")).isDisplayed();
		driver.findElement(By.xpath("//*[text()='Price Total']")).isDisplayed();
		driver.findElement(By.id("finish")).click();
		driver.manage().window().maximize();
		
	}

}
 