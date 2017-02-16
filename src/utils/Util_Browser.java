package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Util_Browser 
{
    public WebDriver openBrowser(WebDriver driver,String strBrowserName) throws Exception
    {
        if(strBrowserName.equals("Firefox"))
        {
            driver = new FirefoxDriver();	
            
            driver.manage().window().maximize();
 
            driver.get(Constant.URL);
        }
        else if(strBrowserName.equals("Chrome"))
        {
        	System.setProperty("webdriver.chrome.driver", "C:\\Supporting file for Selenium\\Browser Drivers\\Chrome\\chromedriver 2.25.exe");
        	
        	driver=new ChromeDriver();
        	
        	driver.manage().window().maximize();
        	
            driver.get(Constant.URL);
        }
        else if(strBrowserName.equals("IE"))
        {
        	System.setProperty("webdriver.ie.driver", "C:\\Supporting file for Selenium\\Drivers\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
        	
        	driver=new InternetExplorerDriver();
        	
        	driver.manage().window().maximize();
        	
            driver.get(Constant.URL);
        }
        else
        {
        	System.out.println("Service Not Avaiable");
	    }
	    return driver;
	}	 
}
