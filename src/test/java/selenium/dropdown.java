package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/chromedriver_win32/chromedriver.exe");
		
		WebDriver Driver =new ChromeDriver();
		
		Driver.get("https://demo.guru99.com/test/newtours/register.php ");
		
		//Driver.findElement(By.xpath("//option[contains(text(),'ARMENIA')]")).click();
		
		//By using select class Drop down implemenation
		
		Select sel=new Select(Driver.findElement(By.name("country")));
		
		sel.selectByValue("ANDORRA");
		
		sel.selectByIndex(5);
		
		sel.deselectByVisibleText("BANGLADESH");
		
		
	}

}