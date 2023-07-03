package TestNgPractic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test333 {
	
	
	@Test (invocationCount = 5, threadPoolSize = 4)
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acs\\Desktop\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
	     WebDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		
	}

}
