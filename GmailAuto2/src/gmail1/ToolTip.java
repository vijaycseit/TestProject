package gmail1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

		public static WebDriver driver;
		
		public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vardhan\\eclipse-workspace\\GmailAuto2\\Libs\\ChromeDriver\\chromedriver.exe");	
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			
				String tp = driver.findElement(By.id("hp-widget__sTo")).getAttribute("title");
				System.out.println(tp);
		}

}
