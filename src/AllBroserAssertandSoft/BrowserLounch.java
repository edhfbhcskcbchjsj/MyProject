package AllBroserAssertandSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLounch{
	
	public static  void  main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acs\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("radhe123");
		WebElement password = driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(3000);
		password.sendKeys("radhe@123");
		WebElement button = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		Thread.sleep(3000);
		button.click();
		
		driver.navigate().refresh();
		
		
		
		
	}
	

}
