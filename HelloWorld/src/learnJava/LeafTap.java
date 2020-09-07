package learnJava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class LeafTap {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	@Test
	
	public void browserTest1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		
	}

}
