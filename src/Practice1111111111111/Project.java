package Practice1111111111111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
	
	public static void main(String[]args) {

 System.setProperty("webdriver.chrome.driver", "C:\\Users\\acs\\Desktop\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 driver.manage().window().maximize();
 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	

}
}
