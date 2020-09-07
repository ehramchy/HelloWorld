package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificWrapper{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//@Test
	
	//public void editLead() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
        
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();	
		

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();	
		
		//driver.findElementByXPath("Edit").click();
		driver.findElementByLinkText("Leads").click();
		
		//driver.findElementByXPath("on").sendKeys("Hema");
		
		//driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		
		driver.findElementByXPath("(//button[@type='button'])[7]").click();
		//driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		
		//driver.findElementByLinkText("//button[text()='Find Leads']").click();
		
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]").click();
		//driver.findElementByLinkText("Hema").click();
	      driver.findElementByLinkText("Hema").click();	
		//Verify Title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("View")) {
		System.out.println("title Matched");}
		else {System.out.println("title not mathched");}
		
		driver.findElementByLinkText("Edit").click();
		
		//driver.findElementByXPath("(//input[@class='inputBox'])[1]").sendKeys("CTS");
				
        driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");
		
		driver.findElementByName("submitButton").click();
		
		String fname = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(fname);
		if(fname.equals("Rumman")) {
			System.out.println("Rumman matched");
		}
		else {System.out.println("not matched");}
		//driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");*/
		/*String changeName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(changeName);
		
		if(changeName.contains("CTS")) {
			System.out.println("Name is matched");
		} else{
		      System.out.println("not matched");
		}
		//String changename = driver.findElementById("viewLead_companyName_sp").getText();
		
		//driver.close();*/
	}

}
