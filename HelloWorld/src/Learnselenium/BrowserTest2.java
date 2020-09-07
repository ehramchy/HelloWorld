    package Learnselenium;

    import java.util.concurrent.TimeUnit;

    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import SeleniumDemo.ProjectSpecificWrapper;

    public class BrowserTest2 extends ProjectSpecificWrapper {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    @Test
    
    public void browserTest2() {
    	
    /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
	ChromeDriver driver = new ChromeDriver();
		
	//Load url
	driver.get("http://leaftaps.com/opentaps/control/main");
		
	//Maximise window
	driver.manage().window().maximize();
		
		
	driver.getTitle();
		
	// Implicitly wait  
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	//enter username
	driver.findElementById("username").sendKeys("Demosalesmanager");
		
	//Enter password
	driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
	//Click login
	driver.findElementByClassName("decorativeSubmit").click();
		
	//Click CRM/SFA
	driver.findElementByLinkText("CRM/SFA").click();*/
		
	//driver.close();
	//Thread.sleep(3000);
		
	//Click create lead
      driver.findElementByLinkText("Create Lead").click();
			
	//Enter companyname
	  driver.findElementByClassName("inputBox").sendKeys("T&T");
		
	//Enter Forename
	 driver.findElementById("createLeadForm_firstName").sendKeys("Ehram");
		
	//Enter Surname
	  driver.findElementById("createLeadForm_lastName").sendKeys("Chy");
		
	//Enter First Name (Local)
	 driver.findElementById("createLeadForm_firstNameLocal").sendKeys("k");
		
	//Enter Last Name (Local)
	  driver.findElementById("createLeadForm_lastNameLocal").sendKeys("RR");
		
	//Enter Solution
		
	  driver.findElementById("createLeadForm_personalTitle").sendKeys("B");
		
	//Enter Title
	  driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		
	//Enter Department
	  driver.findElementById("createLeadForm_departmentName").sendKeys("IT Solution");
		
	//Enter Annual Revenue
	  driver.findElementById("createLeadForm_annualRevenue").sendKeys("50000");
		
	//Enter Number of Employees
	  driver.findElementById("createLeadForm_numberEmployees").sendKeys("700");
		
	//Enter Ticker Symbol 
	  driver.findElementById("createLeadForm_tickerSymbol").sendKeys("KK");
		
	//SIC Code
	  driver.findElementById("createLeadForm_sicCode").sendKeys("bt");
		
	//Enter Address line 1
	  driver.findElementById("createLeadForm_sicCode").sendKeys("kt");
		
	//Enter Description
	  driver.findElementById("createLeadForm_description").sendKeys("This is a very good IT Solution c");
		
	//Enter Description
	  driver.findElementById("createLeadForm_importantNote").sendKeys("This is a IT Firm");
		
	//Enter Area Code
	  driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("00");
	//enter Phone Number
	  driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("01239876542");
		
	//Enter Extension
	  driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("2");
		
	//E-mail Address
	  driver.findElementById("createLeadForm_primaryEmail").sendKeys("adss@gmail.com");
		
	//Enter Person to Ask for
	  driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("rumman");
		
	//Enter Web URL
	  driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("trs");
		
	//Enter To Name
	  driver.findElementById("createLeadForm_generalToName").sendKeys("ksss");
		
	//Enter Attention Name
	  driver.findElementById("createLeadForm_generalAttnName").sendKeys("RRS");
		
	//Enter Address Line 1
	  driver.findElementById("createLeadForm_generalAddress1").sendKeys("Field LANE");
		
	//Enter Address Line 2
	  driver.findElementById("createLeadForm_generalAddress2").sendKeys("Broad Way");
		
	//Select Class for Drop Down (how to handle with Drop down?)
	//Identify the Drop down element and Pass to Select class
	  WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
	  Select dd = new Select(Source);		
		
    //Enter City
	  driver.findElementById("createLeadForm_generalCity").sendKeys("Ray");
		
	//Enter State/Province
	//driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("gold");
		
	//Enter Postal Code
	  driver.findElementById("createLeadForm_generalPostalCode").sendKeys("12323");
		
	//Enter Zip Code/Postal
	  driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("2332");
		
	//Click Create Lead
	//driver.findElementByName("submitButton").click();
	
		

	}

}
