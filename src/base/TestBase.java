package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utils.TestUtils;


public class TestBase{
	
    public static Properties prop;
	public File f;
	public FileInputStream fis;
	public static WebDriver driver;
	
	public TestBase() throws Exception {
		try{
		prop = new Properties();
		File f = new File("C:\\Users\\neoni\\workspace\\OrangeHRM\\src\\configurations\\Config.Properties");
		fis = new FileInputStream(f);
		prop.load(fis);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		}

	
	public void initialization() throws Exception {
		String browser = prop.getProperty("BROWSER");
		if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\neoni\\workspace\\OrangeHRM\\src\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE")) {
			System.out.println("Internet Explorer");
			System.setProperty("webdriver.IE.driver", "C:\\Users\\neoni\\workspace\\OrangeHRM\\src\\browserDrivers\\iexplore.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.get(prop.getProperty("URL"));
		}
	

	
	
	
	
	
	
	
	
	
	
}
