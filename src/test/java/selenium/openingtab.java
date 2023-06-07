package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.saucedemo.com/");
		
	}}