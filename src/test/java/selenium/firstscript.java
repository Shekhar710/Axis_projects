package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class firstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/chromedriver_win32/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in");
/*driver.findElement(By.id("pass")).sendKeys("abc");
driver.findElement(By.name("email")).sendKeys("abc@gmail");
driver.findElement(By.name("login")).click();*/
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.manage().window().maximize();
System.out.println(driver.findElement(By.id("abc")).isDisplayed());
	}

}
//C:\\Users\\DELL\\Desktop\\chromedriver_win32\\chromedriver.exe