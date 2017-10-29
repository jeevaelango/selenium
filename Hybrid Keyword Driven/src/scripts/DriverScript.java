
package scripts;

import org.openqa.selenium.WebDriver;

import config.ActionKeywords;
import utility.Constant;
import utility.ExcelUtils;

public class DriverScript
{
	static WebDriver driver;
	
	static ActionKeywords ak;
	
	static String str_TestData;
	
	public void Execute() throws Exception
	{
		ak = new ActionKeywords(driver);
		 
    	ExcelUtils.setExcelFile(Constant.Path, Constant.Sheet_Name_TestSteps);
    	
    	int rowCount=ExcelUtils.getRowCount();
    	
    	System.out.println(rowCount);
    	
    	for (int row=1;row<=rowCount;row++)
    	{
    		String str_ActionKeyword = ExcelUtils.getCellData(row, Constant.Col_ActionKeyword);
    		
    		System.out.println(str_ActionKeyword);
    		
    		if(str_ActionKeyword.equals("openBrowser"))
    		{
    			System.out.println("Action openBrowser Initiated");
    			
    			driver=ak.openBrowser();
    			
    			System.out.println("Action openBrowser Completed");
    		}
    		
    		else if(str_ActionKeyword.equals("navigate"))
    		{
    			System.out.println("Action navigate Initiated");
    			
    			ak.navigate();
    			
    			System.out.println("Action navigate completed");
    		}
    		
    		else if(str_ActionKeyword.equals("input_username"))
    		{
    			str_TestData = ExcelUtils.getCellData(row,Constant.Col_TestData);
    			
    			System.out.println(str_TestData);
    			
    			System.out.println("Action input_username Initiated");
    			
    			ak.input_username(str_TestData);
    			
    			System.out.println("Action input_username Completed");
    		}
    		
    		else if(str_ActionKeyword.equals("input_password"))
    		{
    			str_TestData = ExcelUtils.getCellData(row,Constant.Col_TestData);
    			
    			System.out.println(str_TestData);
    			
    			System.out.println("Action input_password Initiated");
    			
    			ak.input_password(str_TestData);
    			
    			System.out.println("Action input_password Completed");
    		}
    		
    		else if(str_ActionKeyword.equals("click_login"))
    		{
    			System.out.println("Action click_login Initiated");
    			
    			ak.click_login();
    			
    			System.out.println("Action click_login Completed");
    		}
    		
    		else if(str_ActionKeyword.equals("waitFor"))
    		{ 
    			System.out.println("Action waitFor Initiated");
    			
    			ak.waitFor();
    			
    			System.out.println("Action waitFor Completed");
    		}
    		
    		else if(str_ActionKeyword.equals("closeBrowser"))
    		{
    			System.out.println("Action closeBrowser Initiated");
    			
    			ak.closeBrowser();
    			
    			System.out.println("Action closeBrowser Completed");
    		}
    		else
    		{
    			System.out.println("No Action avaiable with this name");
    		}
    	}

	}
}