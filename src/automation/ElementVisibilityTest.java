package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

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
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//1.isDisplayed() method applicable for all element
		
		boolean b1=driver.findElement(By.className("signinbtn")).isDisplayed();	
		System.out.println(b1);
		
		//2.isEnabled() method 
		
		boolean b2=driver.findElement(By.className("signinbtn")).isEnabled();
		System.out.println(b2);
		
		//3.isSelected() for checkbox,	dropdown,radiobuttons
		
		boolean b3=driver.findElement(By.name("remember")).isSelected();
		System.out.println(b3);
		
		
	}

}
