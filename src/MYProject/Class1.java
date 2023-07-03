package MYProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1{
	public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\acs\\Desktop\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
//	WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	//uname.sendKeys("Admin");
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		
		
		
		
		
	}
	
	
	
}