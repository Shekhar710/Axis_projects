package flipcartgrid;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practical {

	 WebDriver driver;
	    String nodeURL;
	    
	 
	    public WebDriver setUp(String Port) throws MalformedURLException
	    {           
	        if(Port.equalsIgnoreCase("5555"))
	        {
	            nodeURL = "http://192.168.1.2:4444/wd/hub";
	            System.out.println("Chrome Browser Initiated");
	            DesiredCapabilities capabilities = DesiredCapabilities.chrome();            
	            capabilities.setBrowserName("chrome");
	            capabilities.setPlatform(Platform.WINDOWS);
	            
	            driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
	            
	            driver.get("https://www.flipkart.com/");
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }
	        
	        else
	            if(Port.equalsIgnoreCase("6666"))
	            {
	                nodeURL = "http://192.168.1.2:4444/wd/hub";
	                System.out.println("Edge Browser Initiated");
	                DesiredCapabilities capabilities1 = DesiredCapabilities.edge();
	                capabilities1.setBrowserName("MicrosoftEdge");
	                capabilities1.setPlatform(Platform.WINDOWS);
	                
	                driver = new RemoteWebDriver(new URL(nodeURL),capabilities1);   
	                
	                driver.get("https://www.flipkart.com/");
	                driver.manage().window().maximize();
	                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            }
	        
	      return driver; 
	    } 
	    
	
	      
	    }