package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	
	public static WebDriver driver;
	
	@Before
	
	public void webdriverinitialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhilashaDhande\\Desktop\\FST\\Automation\\chromedriver_win32\\chromedriver.exe");
		System.out.println("browser is launching");
		driver = new ChromeDriver();
	}
	
	@After
	
	public void closebrowser()
	{
		driver.close();
	}

}
