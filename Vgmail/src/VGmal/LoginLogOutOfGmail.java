package VGmal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Actions.*;


public class LoginLogOutOfGmail {

		
	
	@Test
	public static void GmailLoginLogOut() {
	
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vardhan\\eclipse-workspace\\Vgmail\\Libs\\ChromeDriver\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		LaUrl.ChromePropfile();
		LaUrl.LaunchGmailUrl();
		LogInAndLogOut.LogIn();
		LogInAndLogOut.LogOut();
		LogInAndLogOut.QuitBrowser();
				
		
	}
	
}
