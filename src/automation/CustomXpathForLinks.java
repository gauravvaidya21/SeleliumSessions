package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathForLinks {

	public static void main(String[] args) {
		
		//google chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		//entering url to browser
				
				driver.get("https://www.flipkart.com/");
				
		//to maximise windows
				
				driver.manage().window().maximize();
				
		//to clear all cookies after browser launch
				
				driver.manage().deleteAllCookies();		
		
		//to asked selelium to wait for browser to complete load 
				
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				
		//Implicit wait to selelium to load all the components
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//dynamic xpath for links
				
				driver.findElement(By.xpath("//a[conatins(text(),'Login')]")).click();

	}

}
