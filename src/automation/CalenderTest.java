package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderTest {

	public static void main(String[] args) {
		
		//Calendar selection by js
		
		
		
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
		
				driver.get("https://www.makemytrip.com/");
			
				
		        WebElement date=driver.findElement(By.id("departure"));
		    	String dateVal="30-Sep-2021";
		    	
		    	selectDateByJS(driver,date,dateVal);
				


	}
	
	//js function
	
	public static void selectDateByJS(WebDriver driver, WebElement element,String dateVal)
	{
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	}

}
