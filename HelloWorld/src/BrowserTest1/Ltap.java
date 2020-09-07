package BrowserTest1;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ltap {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	@Test
	
	public void browserTest() {


	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");	
		
	ChromeDriver driver = new ChromeDriver();
	
	//Load url
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//Maximise window
	driver.manage().window().maximize();
	
	
	driver.getTitle();
	
	// Implicitly wait  
	//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	//Enter username
    driver.findElementByXPath("//input[@Id='username']").sendKeys("DemoSalesManager");
    
    //Enter Password
    driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
    
    //Click Login/ Button
    driver.findElementByXPath("//input[@value='Login']").click();
    
    //Click CRMSFA, Text Based Xpath(Link text)
    driver.findElementByLinkText("CRM/SFA").click();
    
    //Click Create Lead
   
   driver.findElementByLinkText("Create Lead").click();
    
    
    //Click Leads Link
    driver.findElementByXPath("//a[text()='Leads']").click();
    
    //Click Accounts
    driver.findElementByXPath("//a[text()='Accounts']").click();
    
    
    
   	
	}

}
