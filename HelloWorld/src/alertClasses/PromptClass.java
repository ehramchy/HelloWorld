package alertClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		
		//Implicitly wait  
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		
		System.out.println(driver.getTitle());
		driver.switchTo().frame("iframeResult");
		//PromtAlert Testing
		
		driver.switchTo().frame(0);
		
		driver.findElementByXPath("//button[text()=’Try it’]").click();
		
		Alert promptalert = driver.switchTo().alert();
		System.out.println(promptalert.getText());
		promptalert.sendKeys("kkk");
		
		Thread.sleep(2000);
		promptalert.accept();
		
		Thread.sleep(2000);
		
		
		//Enter inside the frame 		
		/* driver.switchTo().frame(2);
		
		System.out.println(driver.findElementById("result").getText());
		promptalert.sendKeys("Ehram");
		
		//Return back to main page
		   driver.switchTo().defaultContent();
		   
		   
		 driver.findElementByLinkText("demo").click();*/
		
		
		
		
		
		

	}

}
