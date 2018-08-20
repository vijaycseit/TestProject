package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteEmail extends LaUrl {

		
		public static void DeleteMail() {
			driver.findElement(By.xpath("//span[@class=\"bog\" and text()='hai']")).click();
			driver.findElement(By.xpath("//*[@aria-label=\"More\"]")).click();
			driver.findElement(By.xpath("//*[text()='Delete this message']")).click();
		
			}
	
	
	
}
