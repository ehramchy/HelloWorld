package Learnselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		
		//Implicitly wait  
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  
		  WebElement content = driver.findElementByClassName("menulink");
		  
		  
		  Thread.sleep(2000);
		
		Actions action =new Actions(driver);
		action.moveToElement(content).perform();
		
		WebElement content1 = driver.findElementByClassName("Read it now");
		
	}

	}	
		
		
		
		

	


