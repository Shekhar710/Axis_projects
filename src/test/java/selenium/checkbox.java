package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		System.out.println(driver.getCurrentUrl()); 
		driver.findElement(By.xpath("//*[@id='Check Box']")).click();
		WebElement checkbox = driver.findElement(By.xpath("//*[@xmlns='http://www.w3.org/2000/svg']"));
		checkbox.click();
		//driver.findElement(By.xpath("//*[@id='rct-collapse rct-collapse-btn']")).click();
}}
//*[@xmlns='http://www.w3.org/2000/svg']