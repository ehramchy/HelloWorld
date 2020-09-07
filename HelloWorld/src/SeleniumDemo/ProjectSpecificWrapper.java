package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper {

	public ChromeDriver driver;
	
	@BeforeMethod
	
	public void login() {
 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();			
		
		driver.get("http://leaftaps.com/opentaps/control/main");			
		
		driver.manage().window().maximize();		
		
		driver.getTitle();			
		  
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);			
		
		driver.findElementById("username").sendKeys("Demosalesmanager");			
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");			
		
		driver.findElementByClassName("decorativeSubmit").click();			
		
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
		
	@AfterMethod
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
}
