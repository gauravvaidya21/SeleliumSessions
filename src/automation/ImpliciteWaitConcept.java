package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		//to maximise windows
		
		driver.manage().window().maximize();
		
		//to clear all cookies after browser launch
		
		driver.manage().deleteAllCookies();
		
		
		//dynamic wait  [Thread.sleep() is static wait]
			
		//to asked selelium to wait for browser to complete load 
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//Implicit wait to selelium to load all the components
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
