       package Learnselenium;

       import java.util.concurrent.TimeUnit;

       import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

       public class BrowserTest3 {

	    public static void main(String[] args) {
				
    	//@Test
    	
    	//public void browserTest3() {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load url
		driver.get("https://www.bankofamerica.com");
		
		//Maximise window
		driver.manage().window().maximize();
		
		
		driver.getTitle();
		
		// Implicitly wait  
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Enter User ID
		driver.findElementByXPath("//input[contains(@placeholder,'Online ID')]").sendKeys("");
		
		//Enter Passcode
		driver.findElementByXPath("//input[contains(@name,'passcode1')]").sendKeys("");
		
		//Enter About Us
		driver.findElementByXPath("//a[contains(text(),'About Us')]").click();
		
		//Enter Who We Are
		driver.findElementByXPath("//a[contains(@id,'who-we-are')]").click();
		
		
		
		
		
		//*Bank of America(partial attribute base Xpath)
		//Url:https://www.bankofamerica.com/
		//Patrial attribute base Xpath of Username field/Online Id	

	}

}
