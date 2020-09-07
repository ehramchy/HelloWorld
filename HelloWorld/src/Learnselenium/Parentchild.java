package Learnselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load url
		  driver.get("https://jqueryui.com/");
		
		//Maximise window
		  driver.manage().window().maximize();
		
		//Implicitly wait  
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		
	      driver.findElementByLinkText("Selectable").click();
	      
	      
	      //We will use Index number, if in iframedo not have Id or Name Locator.
	      // so will write formula, how to switch to frame(2nd way)
	      
	     //Enter inside the frame 		
		 driver.switchTo().frame(0);
		
		//Click Item 1
		  driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
		  
		  Thread.sleep(3000);
		  
		 //Click Item 3
		  driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		  
		  Thread.sleep(2000);
		 //Click Item 5
		  driver.findElementByXPath("//ol[@id='selectable']/li[5]").click();
		
		 //Way 3 is how to work with class Name
		//driver.switchTo().frame(driver.findElementByClassName("demo-frame");
		  
		
		 //Return back to main page(html)
		   driver.switchTo().defaultContent();
		   
		   
		   driver.findElementByLinkText("Selectable").click();
		
    
		
		
		
		
		
		
		

	}

}
