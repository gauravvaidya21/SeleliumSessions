package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		
		//Google Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();    //to click on sign in button
		
		Thread.sleep(15000);
		
		Alert alert =driver.switchTo().alert();// to switch to alert box
		
		System.out.println(alert.getText());//to get pop up text
		
		//validation
		String msg=alert.getText();
		if(msg.equals("Please enter a valid user name"))
		{
			System.out.println("Correct msg");
		}
		else
		{
			System.out.println("Incorrect msg");
		}
		
		alert.accept(); //to click on Ok button
		
		//alert.dismiss(); //to click on Cancle button

	}

}
