package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathForDynamicID {

	public static void main(String[] args) {
		//Google Chrome Browser
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
				
				//entering url to browser
						
						driver.get("https://community.ebay.com");
						
				//to maximise windows
						
						driver.manage().window().maximize();
						
				//to clear all cookies after browser launch
						
						driver.manage().deleteAllCookies();		
				
				//to asked selelium to wait for browser to complete load 
						
						driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
						
				//Implicit wait to selelium to load all the components
						
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
						
				//customized xpath for dynamic id attribute using conatins method
						
						//driver.findElement(By.xpath("//input[contains(@id,'messageSearchField_')]")).sendKeys("maven");
				
						
				//customized xpath for dynamic id attribute using starts-with method
						
						driver.findElement(By.xpath("//input[starts-with(@id,'messageSearchField_')]")).sendKeys("jenkins");
						
						//when pattern like 1234_test_t and beginning number changes every time then use
						
						//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("HTML");
	}

}
