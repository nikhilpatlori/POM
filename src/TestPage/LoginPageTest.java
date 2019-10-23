package TestPage;

import base.TestBase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageLibrary.LoginPage;

public class LoginPageTest extends TestBase{
	
public LoginPage obj1;


public LoginPageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

@BeforeMethod
public void setUp() throws Exception {
	TestBase obj = new TestBase();
	obj.initialization();
	obj1 = new LoginPage();
}

//@Test
//public void manualLogin() throws Exception {
//  obj1.loginManual("selenium", "selenium");
// driver.quit();
//}

//@Test
//public void ExcelSheetLogin() throws Exception {
//	obj1.loginExcel();
//	driver.quit();
//}

@Test
public void ConfigPropLogin() {
	obj1.loginconfig();
 driver.quit();
}
	
}
