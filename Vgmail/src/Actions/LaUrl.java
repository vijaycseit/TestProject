package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaUrl {

public static WebDriver driver;

		
			public static void ChromePropfile() {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\vardhan\\eclipse-workspace\\DMMT\\library\\chromeD\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}



			public static void LaunchGmailUrl() {
				driver.get("https://www.google.com/gmail/about/#");	
				driver.manage().window().maximize();
				}
			
			
		
			public static void QuitBrowser() {
				driver.quit();
				}
	
	








}
