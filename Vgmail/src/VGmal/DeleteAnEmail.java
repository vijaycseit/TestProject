package VGmal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Actions.*;


public class DeleteAnEmail {

	static WebDriver driver;
	
	@Test
	public static void DeleteMail() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vardhan\\eclipse-workspace\\Vgmail\\Libs\\ChromeDriver\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	LaUrl.ChromePropfile();
	LaUrl.LaunchGmailUrl();
	LogInAndLogOut.LogIn();
	DeleteEmail.DeleteMail();
	LogInAndLogOut.QuitBrowser();
	
	
	
	
		
		
	}
	
	
}
