package automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {

	 static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		
		Properties prop=new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\selelium_session\\src\\automation\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		System.out.println(prop.getProperty("URL"));
		
		String browsername= prop.getProperty("browser");
		
		String url=prop.getProperty("URL");
		
		if(browsername.equals("GoogleChrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
			 driver =new ChromeDriver();
			
		}
		  driver.get(url);		
     
		  driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
		  
		  driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		  
		  driver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();
	}

}
