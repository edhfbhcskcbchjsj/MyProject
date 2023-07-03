package ProjectPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	static WebDriver driver;
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acs\\Desktop\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     WebElement usename = driver.findElement(By.xpath("//input[@name='usename']"));
     usename.sendKeys("radhe");
    
     WebElement mobileno = driver.findElement(By.xpath("//input[@name='password']"));
     mobileno.sendKeys("9881528215");
   
	 
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 driver.close();
	 
	 
		
		
		
		
		
		
		
		
	}

}
