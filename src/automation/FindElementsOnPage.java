package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindElementsOnPage {

	public static void main(String[] args) {
		

		//google chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		//entering url to browser
				
				driver.get("https://www.pwc.com/");
				
		//to maximise windows
				
				driver.manage().window().maximize();
				
		//to clear all cookies after browser launch
				
				driver.manage().deleteAllCookies();		
		
		//to asked selelium to wait for browser to complete load 
				
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				
		//all links are represented by <a>	tag in HTML
				
				List <WebElement>  linklist=driver.findElements(By.tagName("a"));
				
		//size of link list
				
				System.out.println(linklist.size());
				
		//print text for all links and some links are blank that they don't have text
				
				for(int i=0;i<linklist.size();i++) {
					
					System.out.println(linklist.get(i).getText());
				}
				
		//to find input text		
				List <WebElement>  list=driver.findElements(By.tagName("input"));
				System.out.println(list.size());
				
		//to find input text		
				List <WebElement>  listbutton=driver.findElements(By.tagName("button"));
				System.out.println(listbutton.size());		
	}

}
