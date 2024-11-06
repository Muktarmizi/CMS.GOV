package baseutil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {

	public WebDriver driver;
	
	public HomePage homePage; 
	
	@BeforeMethod	
	public void setUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mizim\\eclipse-workspace\\gov.cms.portal.augest2024\\driver\\chromedriver.exe");	
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://portal.cms.gov/portal/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		homePage = new HomePage(driver);
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	
	
	
	
	

}


