package ProjectPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BYJuiceLoginPage {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acs\\Desktop\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://byjus.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     WebElement usename = driver.findElement(By.xpath("//input[@name='name']"));
	     usename.sendKeys("radhe");
	    
	     WebElement mobileno = driver.findElement(By.xpath("//input[@name='mobile']"));
	     mobileno.sendKeys("9881528215");
	   
	     Assert.assertFalse(mobileno.isSelected(), "Validate your mobile numbe");
	     Assert.assertTrue(mobileno.isDisplayed(), "Validate your mobile numbe");
	    
	    
	    
	    WebElement emaiId = driver.findElement(By.xpath("//input[@name='email']"));
	    emaiId.sendKeys("radhej014@gmail.com");
	    
        WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
        state.sendKeys("Maharashtra");
        
       Select statef= new Select(state);
       Assert.assertTrue(state.isDisplayed(), "state  drop down is not available");
       Assert.assertFalse(state.isSelected(), "the state is selected initially");
	   statef.selectByVisibleText("Maharashtra");
	   
	   WebElement sumitbtn = driver.findElement(By.xpath("//button[text()='Schedule a Free Class']"));
	   sumitbtn.click();
	
	}

}
