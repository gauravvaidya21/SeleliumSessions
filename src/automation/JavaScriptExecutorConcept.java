package automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException {
		
		//Google Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//handling windows and cookies
		
		driver.manage().window().maximize(); //to maximize window size
		driver.manage().deleteAllCookies();  //to delete all cookies from browser
 
		//entering url to browser
		
		driver.get("https://freecrm.com/");
		
		//dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//using link text locator -----use only for links
		

		
		//to click on login
		
		//driver.findElement(By.cssSelector(".fluid")).click();
		
		//executeScript -- to execute JavaScript code
		
		WebElement loginbtn=  driver.findElement(By.linkText("LOG IN"));
		
		flash(loginbtn,driver);  //to highlight login button
		
		drawBorder(loginbtn,driver);//to draw border around button
		
	//then take screenshot
		
		//to take screenshot and store it as file format
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
       //copy screenshot to particular	location using copyfile method
		
		FileUtils.copyFile(scr,new File("C:\\Users\\admin\\eclipse-workspace\\selelium_session\\src\\automation\\new.png"));
		
		//to generate alert
		
		//generateAlert(driver,"There is problem with login button on login page");
		
		//to click element by js
		
		clickElementByJS(loginbtn,driver);
		
		//refresh the page:
				//1. by using selenium:
				driver.navigate().refresh(); 
				
				//2. by using JS executor:
				refreshBrowserByJS(driver);
				
		//get the tile of the page by JS:
				System.out.println(getTitleByJS(driver));
		
	}

	public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  10; i++) {
            changeColor("rgb(0,200,0)", element,driver);//1
            changeColor(bgcolor, element,driver);//2
        }
}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
    	JavascriptExecutor js = ((JavascriptExecutor) driver);	
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(20);
        }  catch (InterruptedException e) {
        }
     }
	
	 public static void drawBorder(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].style.border='3px solid yellow'", element);
	    }
	 
	 public static void generateAlert(WebDriver driver, String message){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("alert('"+message+"')");
	
       }
	  	
	 public static void clickElementByJS(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].click();", element);
	    	
	    }
	 
	 public static void refreshBrowserByJS(WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("history.go(0)");
	    }
	 
	 public static String getTitleByJS(WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	String title = js.executeScript("return document.title;").toString();
	    	return title;
	    }
}