package org.Manipal.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Baseconfigurationdemowebshop {

	
	public WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/chromedriver_win32/chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		return driver;

	}

}