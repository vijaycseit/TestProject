package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class LogInAndLogOut extends LaUrl {

	
	public static void LogIn () {
	
		driver.findElement(By.xpath("//*[@data-g-label=\"Sign in\"]")).click();
		driver.findElement(By.xpath("//input[@aria-label=\"Email or phone\"]")).sendKeys("vijayjda33065@gmail.com");	
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();	
		driver.findElement(By.xpath("//input[@aria-label=\"Enter your password\"]")).sendKeys("vision2k123");	
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();	
		driver.findElement(By.xpath("//*[contains (@title, 'Google Account:')]")).click();
		String gmailId = driver.findElement(By.xpath("//*[text() = 'vijayjda33065@gmail.com']")).getText();
		Assert.assertEquals(gmailId, "vijayjda33065@gmail.com");
			
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ESCAPE).perform();
		
		}

	
	
	public static void LogOut (){
		
	driver.findElement(By.xpath("//*[contains (@title, 'Google Account:')]")).click();	
	driver.findElement(By.xpath("//*[text() = 'Sign out']")).click();
	//String logoutmail = driver.findElement(By.xpath("//*[text() = 'vijayjda33065@gmail.com']")).getText();
	//Assert.assertEquals(logoutmail, "vijayjda33065@gmail.com");
	
	}
	
		
	
	public static void QuitBrowser (){
	driver.quit();	
	}

	
	
	
}
