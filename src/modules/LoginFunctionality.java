package modules;

import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;

public class LoginFunctionality
{
	WebDriver driver;
	
	public LoginFunctionality(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void LoginExec(String username,String password)
	{
		LoginPage lp = new LoginPage(driver);
		lp.lnkLogin().click();
		lp.txtboxUsername().sendKeys(username);
		lp.txtboxPassword().sendKeys(password);
		lp.btnLogin().click();
	}
}
