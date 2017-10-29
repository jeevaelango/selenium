package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Constant;

public class ActionKeywords 
{
	
	public WebDriver driver;
	
	public WebElement txtbox_username,txtbox_password,btn_login;
	
	public ActionKeywords(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebDriver openBrowser()
	{		
		//System.setProperty("webdriver.chrome.driver","C:\\Supporting file for Selenium\\chromedriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public void navigate()
	{
		driver.get(Constant.URL);
	}
	
	public void input_username(String str_username)
	{
		txtbox_username=driver.findElement(By.xpath(".//input[@name='userName']"));
		txtbox_username.sendKeys(str_username);
	}
	
	public void input_password(String str_password)
	{
		txtbox_password=driver.findElement(By.xpath(".//input[@name='password']"));
		txtbox_password.sendKeys(str_password);
	}
	
	public void click_login()
	{
		btn_login=driver.findElement(By.xpath(".//input[@name='login']"));
		btn_login.click();
	}
	public void waitFor() throws InterruptedException 
	{
		Thread.sleep(5000);
	}

	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}

}