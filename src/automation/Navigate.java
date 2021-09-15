package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		
		//google chrome browser
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
				
				//entering url to browser
						
						driver.get("https://www.google.com/");
						
				//to maximise windows
						
						driver.manage().window().maximize();
						
				//to clear all cookies after browser launch
						
						driver.manage().deleteAllCookies();		
				
				//to asked selelium to wait for browser to complete load 
						
						driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				
				//to navigate to particular website
						
						driver.navigate().to("https://www.pwc.com");  //it is use to navigate external URL
						
				//naviage back to google
						
						driver.navigate().back();
						
						Thread.sleep(1500);
						
						driver.navigate().forward();//to click fwd tab
						
						Thread.sleep(1500);
						
						driver.navigate().refresh();
						
						

	}

}
