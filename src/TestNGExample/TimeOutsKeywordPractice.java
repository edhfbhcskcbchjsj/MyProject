package TestNGExample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOutsKeywordPractice {
	
	@BeforeClass
	public void LaunchBroser() {
		 System.out.println("Browser is Launched");
		
	}
	
	@BeforeClass
	public void  closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	@BeforeMethod
	public  void Login() {
		System.out.println("Logged in to the application");
	}
	
	@BeforeMethod
	public void  Logout() {
		System.out.println("Logout in to the application");
	}

	@Test(priority = 1 ,timeOut = 5000)
	public void HomePageTest() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("checked the homepage of the application");
    
	}

	@Test(priority = 2,invocationCount = 5)
	public  void NotificationPageTest() {
		System.out.println("checked the notification page of application");
	}
	
	
	
	
	

}
