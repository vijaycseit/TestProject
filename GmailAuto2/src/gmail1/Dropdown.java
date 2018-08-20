package gmail1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    public static WebDriver driver; 
	
	
    public static void main(String[] args) {

	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vardhan\\eclipse-workspace\\GmailAuto2\\Libs\\ChromeDriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 
	 
	 //for month
	 
	 WebElement ele = driver.findElement(By.id("month"));
	 Select sel = new Select(ele);
	 //sel.selectByIndex(10);
	 //sel.selectByVisibleText("May");
	 
	 
	 List<WebElement> list = sel.getOptions();
	 
	 			for(int i=0; i<list.size(); i++) 
	 			{
	 					if(list.get(i).getText().contains("Jun")) {
	 					sel.selectByIndex(i);
	 					}
	 			}
	 			
	

	 			//for date			
	 			
	 			WebElement elem = driver.findElement(By.id("day"));			
	 			Select sele = new Select(elem);
	 			List<WebElement> list1 = sele.getOptions(); 
	
	 			for(int j = 0; j<list1.size(); j++) 
	 			{
	 			
	 					if(list1.get(j).getText().contains("26")) {	
	 						sele.selectByIndex(j);
	 					}
	 				
	 			}
	 
	 			
	 //for year			
	 			WebElement Elem = driver.findElement(By.id("year"));
	 			Select Sel = new Select(Elem);
	 			List<WebElement> list2 = Sel.getOptions();
	 			
	 			for(int a = 0; a<list2.size();a++)
	 			{	
	 				if(list2.get(a).getText().contains("1990")) {		
	 				Sel.selectByIndex(a);	
	 					
	 				}
	 			
	 			driver.findElement(By.xpath("//*[text()=\"Female\"]")).click();
	 			
	 			
	 			}
	 			
	 			driver.quit();
	 			
	 			
	 			
	 			
	 			
	 			
	 			
	
}	
	
	
	
	
	
}
