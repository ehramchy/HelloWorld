package alertClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");

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
		
		
		//String currentWindow = driver.getWindowHandle();
	    //System.out.println(currentWindow);
		
		//Click login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		//driver.close();
		//Thread.sleep(3000);
		
		//Click create lead
		 driver.findElementByLinkText("Create Lead").click();	
		
		//merge Lead
		 driver.findElementByLinkText("Merge Leads").click();
		
		 driver.findElementByLinkText("Merge").click();
        //driver.findElementByClassName("buttonDangerous").click();      
              
        
        //System.out.println(confirmalert.getText());
        
        //driver.switchTo().alert().accept();
        org.openqa.selenium.Alert ttt = driver.switchTo().alert();
		System.out.println(ttt.getText());
		Thread.sleep(3000);
	    
		//System.out.println(ConfirmationAlert.getText());
		
		Thread.sleep(3000);
		//confirmationAlert.ac

        
	}

}
