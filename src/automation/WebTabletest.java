package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabletest {

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
				
//1.method 1
		
		// //html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/a
		///html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/a
		///html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[2]/a
		
		/*
		String before_xpath="//html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[";
		String after_xpath="]/td[2]/a";
		
		for(int i=1;i<4;i++)
		{
			String name= driver.findElement(By.xpath(before_xpath +i+ after_xpath)).getText();
			System.out.println(name);
			if(name.contains("gaurav v")) {
				//  /html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[1]/div/label
				driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr["+i+"]/td[1]/div/label")).click();
			}//here problem with xpath
	  */
		
//2. method 2  --custom xpath using preceding and forwarding--parent and child
		
			driver.findElement(By.xpath("//a[contains(text(),'gaurav v')]/parent::td//preceding-sibling::td//input[@name='id']")).click();
		}
		

		
		
	}


