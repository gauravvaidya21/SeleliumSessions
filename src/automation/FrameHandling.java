package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
	
		//Google Chrome Browser
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
		//handling windows and cookies
				
				driver.manage().window().maximize(); //to maximize window size
				driver.manage().deleteAllCookies();  //to delete all cookies from browser
					
		//dynamic wait
				
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//entering url to browser
				
				driver.get("https://freecrm.com/");
				
        //using link text locator -----use only for links
				
		
				driver.findElement(By.linkText("LOG IN")).click();
			
		//to fill login credentials
				
				driver.findElement(By.name("email")).sendKeys("vaidya.gaurav21@gmail.com");
				driver.findElement(By.name("password")).sendKeys("9923@Gaurav");
				
		//to click on login
				
				driver.findElement(By.cssSelector(".fluid")).click();
				
		//to shift on contact tab
				
				driver.findElement(By.cssSelector("div.menu-item-wrapper:nth-child(3) > a:nth-child(1)")).click();
				
				
		//there is no frame in this page if frame occoures in page and we have to switch to frame the use bellow API
				
				//driver.switchTo().frame("frame name");
				
	}

}
