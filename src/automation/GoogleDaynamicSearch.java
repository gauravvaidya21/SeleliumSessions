package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDaynamicSearch {

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
				
				driver.get("https://google.com");

				driver.findElement(By.name("q")).sendKeys("testing");
				
				//Descendant is use for dynamic xpath
				
				List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
				
				System.out.println("Total number of suggesions are"+  list.size());
				
				for(int i=0;i<list.size();i++)
				{
					
					System.out.println(list.get(i).getText());
					if(list.get(i).getText().contains("testing powder"))
					{
						list.get(i).click();
						break;
					}
					
				}
	}

}
