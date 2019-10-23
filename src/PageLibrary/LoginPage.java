package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExcelUtils.ExcelUtil;
import base.TestBase;

public class LoginPage extends TestBase{
	

	@FindBy(name = "txtUserName") WebElement Username;
	@FindBy(name = "txtPassword") WebElement Password;
	@FindBy(name = "Submit") WebElement LoginButton;
	@FindBy(name = "clear") WebElement ClearButton;
	
	public LoginPage()throws Exception{
		PageFactory.initElements(driver, this); 
		//u can write this/LoginPage.class this means pointing to the current class object
		}	
	
	public void loginconfig() {
		Username.sendKeys(prop.getProperty("USERNAME"));
		Password.sendKeys(prop.getProperty("PASSWORD"));
		LoginButton.click();		
	}
	
	public void loginManual(String USERNAME, String PASSWORD) {
		Username.sendKeys(USERNAME);
		Password.sendKeys(PASSWORD);
		LoginButton.click();
	}
	
	public void loginExcel() throws Exception {
		ExcelUtil obj = new ExcelUtil();
		String[] str = new String[2];
		str = obj.excelData(str);
		Username.sendKeys(str[0]);
		Password.sendKeys(str[1]);
		LoginButton.click();	
	}
	
	
}
