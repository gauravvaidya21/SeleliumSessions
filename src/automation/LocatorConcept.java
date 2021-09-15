package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {
	
		
		//Google Chrome Browser
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
				driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ascsubtag%3D_k_EAIaIQobChMI8bm24-jL8gIVk38rCh3TSAOAEAAYASAAEgKosvD_BwE_k_%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMI8bm24-jL8gIVk38rCh3TSAOAEAAYASAAEgKosvD_BwE%26ie%3DUTF8%26network%3Dg%26tag%3Dgooghydrabk-21%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
				
				//1.using x-path locator----second priority and only relative(//*[@id=\"ap_customer_name\)  xpath
				//
				//not absolute(/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[8]/a) xpath
				
				/*
				driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Gaurav");
				driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("gaurav.vaidya@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("abcdefg");
				*/
				
				//2.using id locator  ---first priority
				
				/*
				driver.findElement(By.id("ap_customer_name")).sendKeys("vaidya");
				driver.findElement(By.id("ap_email")).sendKeys("vaidya.gaurav@gmil.com");
				driver.findElement(By.id("ap_password")).sendKeys("abcdefs");
			
			   */
				
				
				//3.using name locator ----third priority
				
				/*
				driver.findElement(By.name("customerName")).sendKeys("gaurav");
				*/
				
				//4.using link text locator -----use only for links
				
				/*
				driver.findElement(By.linkText("Sign in")).click();
				*/
				
				//5.using partial link text-------not recommended
				
				/*
				driver.findElement(By.partialLinkText("Create a")).click();
				*/
				
				//6.using css selector locator----second priority
				//if id is there ----#(id)
				//if class is there---.(class name)
				
				
				/*
				driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("gaurav");
				*/
				
				//7.using class locator---not recommended --on fourth priority
				
				/*
				driver.findElement(By.className("a-link-emphasis")).click();
				*/
				
				
				//handling dropbox
				
				Select select=new Select(driver.findElement(By.id("auth-country-picker")));
				
				select.selectByValue("AF");
				
				//for submit or any button use any of above locator
				
				driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
				
				
	}

}
