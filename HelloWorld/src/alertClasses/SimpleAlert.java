package alertClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

    public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");	
		
	ChromeDriver driver = new ChromeDriver();
	
	//Load url
	driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
	
	//Maximise window
	driver.manage().window().maximize();
	
	
	driver.getTitle();
	
	// Implicitly wait  
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);	
		
	driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
	
	Alert sAlert = driver.switchTo().alert();
	System.out.println(sAlert.getText());
	
	Thread.sleep(3000);
	sAlert.accept();
	
	String msg = driver.switchTo().alert().getText();
	
	System.out.println("msg");
		
	Thread.sleep(3000);	
	//Confirmation alert
	Alert ppp = driver.switchTo().alert();
	System.out.println(ppp.getText());
		

	}

}
