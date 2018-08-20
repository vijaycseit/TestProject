package gmail1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

public static WebDriver driver;	
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vardhan\\eclipse-workspace\\GmailAuto2\\Libs\\ChromeDriver\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
		
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.id("ch_trip"))).perform();
	act.sendKeys(Keys.ESCAPE).perform();
	//driver.findElement(By.id("ch_trips_cancel")).click();
	 driver.quit();
	 
	 
	 
	
	 
	 
	//driver.findElement(By.id("ch_trip"));
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
