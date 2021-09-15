package automation;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//1.java script popup---use API(alert,dismiss)
//2.file upload popup---use sendkeys(path)
//3.browser window pop up--use windowHandles()
	

public class handleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//google chrome browser
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
				
				//entering url to browser
						
						driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
						
				//to maximise windows
						
						driver.manage().window().maximize();
						
				//to clear all cookies after browser launch
						
						driver.manage().deleteAllCookies();	

						driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a")).click();
						
						Thread.sleep(2000);
						
						Set<String>  handler = driver.getWindowHandles();
						
						Iterator<String> it=handler.iterator();
						
						String parentwindowid =it.next();
						
						System.out.println("Parent Window id"+parentwindowid);
						
						String childwindowid =it.next();
						
						System.out.println("Child Window id"+childwindowid);
						
						driver.switchTo().window(childwindowid);	
						
						Thread.sleep(2000);
						
						System.out.println("child window pop up	title"+driver.getTitle());

						driver.close();	//close only particular window pop Up not whole browser
						
						driver.switchTo().window(parentwindowid);
						
						Thread.sleep(2000);
						
						System.out.println("parent window pop up title"+driver.getTitle());
						
						driver.close();
						
						
						
						
	}

}
