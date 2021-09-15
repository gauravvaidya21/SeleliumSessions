package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Google Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://html.com/");
		
		//to maximise windows
		
		driver.manage().window().maximize();
		
		//to clear all cookies after browser launch
		
		driver.manage().deleteAllCookies();

		//to control hover moment of mouse
		
		Actions action=new Actions(driver);	
		
		//we can use either linktext or css selector
		
		action.moveToElement(driver.findElement(By.cssSelector(".wrapper-header-menu > div:nth-child(1) > ul:nth-child(2) > li:nth-child(5) > a:nth-child(1)"))).build().perform();
		
		Thread.sleep(2000);
		
		//to click on submenu
		driver.findElement(By.linkText("Defending Your Data")).click();
		
		
	}

}
