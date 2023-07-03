package TestNGExample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountPractice {
	
	@BeforeClass
	public void LaunchBroser() {
		 System.out.println("Browser is Launched");
		
	}
	
	@BeforeClass
	public void  closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	@BeforeMethod
	public  void Ligin() {
		System.out.println("Logged in to the application");
	}
	
	@BeforeMethod
	public void  Logout() {
		System.out.println("Logout in to the application");
	}

	@Test(priority = 2,invocationCount = 5)
	public void HomePageTest() {
		System.out.println("checked the homepage of the application");
    
	}
	
	

}
