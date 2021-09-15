package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

//headless browsing concept

public class HTMLUnitDriverConcept {

	public static void main(String[] args) {
		//google chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver =new ChromeDriver();
		
		//htmlunitdriver----to use this we have to download htmlunitdriver jar file
		//advanteges of htmlunitdriver
		//1.testing without browser
		//2.test execution is very fast
		//3.not use for user action like mouse movement, drag drop,mouse click
		//4.it is ghost driver or headless driver
		
	     WebDriver driver=new HtmlUnitDriver(); 	
		
		//handling windows and cookies
		
		driver.manage().window().maximize(); //to maximize window size
		driver.manage().deleteAllCookies();  //to delete all cookies from browser
		

		
		//dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
//entering url to browser
		
		driver.get("https://freecrm.com/");
		
		System.out.println("Befor login title is:--" +driver.getTitle());
//using link text locator -----use only for links
		

		driver.findElement(By.linkText("LOG IN")).click();
	
//to fill login credentials
		
		driver.findElement(By.name("email")).sendKeys("vaidya.gaurav21@gmail.com");
		driver.findElement(By.name("password")).sendKeys("9923@Gaurav");
		
//to click on login
		
		driver.findElement(By.cssSelector(".fluid")).click();
		
		System.out.println("After login title is:--" +driver.getTitle());
				
				
	}
}
