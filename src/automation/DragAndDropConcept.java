package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable");
		
		//to maximise windows
		
		driver.manage().window().maximize();
		
		//to clear all cookies after browser launch
		
		driver.manage().deleteAllCookies();
		
		//to switch to particular frame-- <iframe> tag is use with frame
	
		driver.switchTo().frame(0);
		
		//pause a while
		
		Thread.sleep(2000);
		
		//to perform particular action use Actions class
		
		Actions action=new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release()
		.build()
		.perform();


	}

}
