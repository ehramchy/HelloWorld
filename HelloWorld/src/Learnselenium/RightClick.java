package Learnselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		//Implicitly wait  
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		
		 WebElement rightclick = driver.findElementByXPath("//span[ext()='right click me']");
		 
		 Actions action =new Actions(driver);
		 action.contextClick(rightclick).perform();
		  
		
		

	}

}
