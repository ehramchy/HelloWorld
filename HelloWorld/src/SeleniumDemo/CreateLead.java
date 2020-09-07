package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificWrapper{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//@Test
	
	//public void createLead() {
        
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();			
			
			driver.get("http://leaftaps.com/opentaps/control/main");			
			
			driver.manage().window().maximize();		
			
			driver.getTitle();			
			  
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);			
			
			driver.findElementById("username").sendKeys("Demosalesmanager");			
			
			driver.findElementByName("PASSWORD").sendKeys("crmsfa");			
			
			driver.findElementByClassName("decorativeSubmit").click();			
			
			driver.findElementByLinkText("CRM/SFA").click();			
			
			driver.findElementByLinkText("Create Lead").click();				
			
			driver.findElementById("createLeadForm_companyName").sendKeys("TCS");		
		    		
		    driver.findElementById("createLeadForm_firstName").sendKeys("Hema");			
		
		   driver.findElementById("createLeadForm_lastName").sendKeys("M");			
		
		   
		  driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms");
			
		 driver.findElementById("createLeadForm_generalAddress1").sendKeys("23Lane");
		  driver.findElementById("createLeadForm_departmentName").sendKeys("MKD");
					
		  driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");		
				  
		  driver.findElementById("createLeadForm_description").sendKeys("TCS");			

		  driver.findElementById("createLeadForm_importantNote").sendKeys("This is an IT Firm");			
		
		  driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("00");
		  
		  driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456");		
			  			
		  driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
				  		
		  driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");				
		  
		  
		//Select Class for Drop Down (how to handle with Drop down?)
		//Identify the Drop down element and Pass to Select class
		  WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		  Select dd = new Select(Source);
			    
		 //Enter State/Province
		driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("Tx");
			driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("Houston");
		//Enter Postal Code
		  driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
			
		//Enter Zip Code/Postal
		 // driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("2332");
			
		//Click Create Lead
		driver.findElementByName("submitButton").click();
		
	}

}
