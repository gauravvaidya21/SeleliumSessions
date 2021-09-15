package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		
		//1.FF Browser
		//geckodriver
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//launch FF browser
		
		driver.get("http://www.google.com");//enter url to browser
		
		
		//2.GoogleChrome
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		
		//driver.get("http://www.google.com");
		
	    String title=driver.getTitle();// getting title
	    System.out.println(title);
	    
	    //validation
	    
	    if(title.equals("Google"))
	    {
	    	System.out.println("Correct Title");
	    }
	    else
	    {
	    	System.out.println("Incorrect Title");
	    }
	    
	    //to get url
	    System.out.println(driver.getCurrentUrl());
	    
	    //to get page source
	    //System.out.println(driver.getPageSource());
	    
	    //to close chrome
	    driver.quit();
	}

}
