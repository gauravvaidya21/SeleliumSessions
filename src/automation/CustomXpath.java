package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		//Google Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		//entering url to browser
				
				driver.get("https://www.ebay.com/");
				
		//to maximise windows
				
				driver.manage().window().maximize();
				
		//to clear all cookies after browser launch
				
				driver.manage().deleteAllCookies();		
		
		//to asked selelium to wait for browser to complete load 
				
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				
		//Implicit wait to selelium to load all the components
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
		//customize x path using class attribute
				
				//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']" )).sendKeys("java");

		//customize xpath using name attribute
				
				//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("c language");
				
		//customized xpath using contains method
				
				//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("selelium webdriver");
				
	}

}
