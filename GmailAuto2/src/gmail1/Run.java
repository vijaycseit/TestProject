package gmail1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {
	 
	public static WebDriver driver;
	public static Properties prop;
	public static File file;
	public static FileReader filereader;
	
	
	//static Gmail SignIn = By.xpath("//*[@data-g-label=\"Sign in\"]");
	//static User Name = By.id("\"identifierId\"");
			
	
	
	public static void main(String[] args) {
		try
		{
			prop = new Properties();
			file = new File("C:\\Users\\vardhan\\eclipse-workspace\\GmailAuto2\\PropFile1");
			filereader = new FileReader(file);
			prop.load(filereader);	
		}		
		catch(Exception e)		
		{	
		
		System.out.println(e.getMessage());
		}
		
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vardhan\\eclipse-workspace\\GmailAuto2\\Libs\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(prop.getProperty("Url"));
			driver.manage().window().maximize();
		
			driver.findElement(By.xpath("//*[@data-g-label=\"Sign in\"]")).click();
			driver.findElement(By.id("identifierId")).sendKeys(prop.getProperty("UserName"));
			driver.findElement(By.id("identifierNext")).click();
			driver.findElement(By.name("password")).sendKeys(prop.getProperty("PassWord"));
			driver.findElement(By.id("passwordNext")).click();
			driver.findElement(By.xpath("//*[contains (@title, 'Google Account:')]")).click();
			driver.findElement(By.id("gb_71")).click();
	}	
		

		
		
		
		
		
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


















