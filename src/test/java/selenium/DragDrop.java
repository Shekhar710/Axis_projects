package selenium;



 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions;



public class DragDrop {



public static void main(String[] args) { // TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/chromedriver_win32/chromedriver.exe"); WebDriver driver = new ChromeDriver();

driver.get("https://demo.guru99.com/test/drag_drop.html");

// Actions class helps you to mimic hovering double clik, drag drop

Actions act = new Actions (driver);

act.dragAndDrop (driver.findElement(By.id("fourth")), driver.findElement(By.id("ants"))). build() .perform();
}}