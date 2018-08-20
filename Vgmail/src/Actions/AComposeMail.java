package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AComposeMail extends LaUrl {

	public static void composeMail() {
		
		driver.findElement(By.xpath("//*[text() = 'COMPOSE']")).click();
		driver.findElement(By.xpath("//*[@aria-label=\"To\"]")).sendKeys("vijayjda33065@gmail.com");
		driver.findElement(By.xpath("//input [@name=\"subjectbox\"]")).sendKeys("vij");
		driver.findElement(By.xpath("//div[@aria-label=\"Message Body\"]")).sendKeys("hai");
		driver.findElement(By.xpath("//* [text()='Send']")).click();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//String SubText = driver.findElement(By.xpath("//span[@class=\"bog\" and text()='vij']")).getText();
		//System.out.println(SubText);
		//Assert.assertEquals(SubText, "vij");
			
		}
	
	
}
