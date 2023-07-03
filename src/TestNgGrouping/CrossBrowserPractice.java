package TestNgGrouping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserPractice {
	WebDriver driver;

	@Parameters("Browser")
	@Test(priority = 1)
	public void CrossBrowerTesting(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acs\\Desktop\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\acs\\Desktop\\selenium jar file\\poi-bin-5.2.2\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			 driver= new FirefoxDriver();
		}
		else {
			System.out.println("Wrong  browser name is selected");
		}
	   
	    driver.get("https://www.facebook.com/login/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 2)
	   public void verifycurrenturl() {
		System.out.println(driver);
		   Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/login/");
		   
	   }
//	
//	@Test(priority = 3)
//	public void  VerifyPageTitile() {
//		System.out.println(driver.getTitle());
//		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
//		
//	}
//	
	
	@Test(priority = 4)
	public void  verifyUsernamefield() {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("radhe123");
		
		
	}
	
	
	@Test(priority = 5)
	public void verifyPasswordfield() {
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("radhe@1234");
	}
	
	
	@Test(priority = 6)
	public void verifyLoginButon() {
		WebElement lbtn = driver.findElement(By.xpath("//button[@name='login']"));
		Assert.assertTrue(lbtn.isEnabled());
		lbtn.click();
	}


}
