package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{

	WebDriver driver;
	WebElement txtuser,txtpass,btnlogin,lnkLogin;
	//Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement lnkLogin()
	{
		lnkLogin = driver.findElement(By.xpath(".//span[@class='login']/small/a[text()='Log in']"));
		return lnkLogin;
	}
	
	public WebElement txtboxUsername()
	{
		txtuser = driver.findElement(By.xpath(".//input[@id='username']"));
		return txtuser;
	}
	
	public WebElement txtboxPassword()
	{
		txtpass= driver.findElement(By.xpath(".//input[@id='password']"));
		return txtpass;
	}
	
	public WebElement btnLogin()
	{
		btnlogin = driver.findElement(By.xpath(".//input[@id='loginbtn']"));
		return btnlogin;
	}
}
