package automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomaticScreenshot {

	public static void main(String[] args) throws IOException {
		
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
				
		//to take screenshot and store it as file format
				
				File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		//copy screenshot to particular	location using copyfile method
				
				FileUtils.copyFile(scr,new File("C:\\Users\\admin\\eclipse-workspace\\selelium_session\\src\\automation\\google.png"));

	}

}
