package Learnselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		//Implicitly wait  
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  
		  driver.switchTo().frame(0);
		  
		  WebElement draggable = driver.findElementById("draggable");
		  
		  WebElement droppable = driver.findElementById("droppable");
		
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		
		action.dragAndDrop(draggable, droppable).perform();	
		
		

	}

}
