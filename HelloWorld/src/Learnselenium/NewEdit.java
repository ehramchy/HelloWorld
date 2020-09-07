package Learnselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
        
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();	
		

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();		
		
		driver.findElementByLinkText("Leads").click();
		
		//driver.findElementByXPath("on").sendKeys("Hema");
		
		driver.findElementByLinkText("Find Leads").click();
		
		//driver.findElementByLinkText("Find Leads]").click();
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		
		
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		
		//driver.findElementByLinkText("//button[text()='Find Leads']").click();
		
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]").click();
		
		driver.findElementByLinkText("Hema").click();
		
		//Verify Title of the page
		
		
		driver.findElementByLinkText("Edit").click();
		
		//driver.findElementByXPath("(//input[@class='inputBox'])[1]").sendKeys("CTS");
		
		driver.findElementByName("submitButton").click();
        driver.findElementById("updateLeadForm_companyName").clear();
        
		driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");
		
		//driver.findElementByXPath("//input{@value='Update'}").click();
		
		String changeName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(changeName);
		
		if(changeName.contains("TCS")) {
			System.out.println("Name is matched");
		} else{
		      System.out.println("not matched");
		}
		//String changename = driver.findElementById("viewLead_companyName_sp").getText();
		
		//driver.close();

	}

}
