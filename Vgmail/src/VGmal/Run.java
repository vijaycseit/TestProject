package VGmal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Actions.AComposeMail;
import Actions.LaUrl;
import Actions.LogInAndLogOut;

public class Run {

	//static WebDriver driver;
		
	@Test
	public static void RunTest() {
		
		
		
		LaUrl.ChromePropfile();
		LaUrl.LaunchGmailUrl();
		LogInAndLogOut.LogIn();
		
		
		
	}
	
	
	
}
