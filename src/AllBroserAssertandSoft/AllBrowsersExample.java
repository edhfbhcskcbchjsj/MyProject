package AllBroserAssertandSoft;
import static org.testng.Assert.assertEquals;

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

public class AllBrowsersExample {

	WebDriver driver;
	@Parameters("Browser")
	@Test(priority = 1)
	public void CrossBrowserTesting(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\acs\\Desktop\\selenium jar file\\cromJar file\\chromedriver.exe");
		    driver = new ChromeDriver();
		    
	
		}else if(Browser.equalsIgnoreCase("firefox")) {
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\acs\\Desktop\\selenium jar file\\poi-bin-5.2.2\\geckodriver-v0.31.0-win32\\geckodriver.exe")	;
	    driver=new FirefoxDriver();	
		}	
		
		else {
			System.out.println("Wrong Browser Name Selected ");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	
		@Test(priority = 2)
		public void VerifycurrentUrl() {
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");		
		
		}
		
		@Test(priority = 3)
		public void  VerifyPageTitile() {
			System.out.println(driver.getTitle());
			Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
			
		}
		
		@Test(priority = 4)
		public void VerifyUserName() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertTrue(username.isDisplayed());	
		username.sendKeys("radhe@123");
		
		}
		
		@Test(priority = 5)
		public void VerifyPassWordField() {
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			Assert.assertTrue(password.isDisplayed());
			password.sendKeys("radhe1234");
		}
		
		@Test(priority = 6)
		public void ClickLoginBtn() {
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		Assert.assertTrue(LoginBtn.isEnabled());
		LoginBtn.click();
		}
		
	
	
	}
	

