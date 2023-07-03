package TestNgPractic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeClass
	public void login() {
		System.out.println("Login the page");
		Reporter.log("LoginPage");
	}
	@AfterClass
	public void Logout() {
		System.out.println("logout the Page");
		Reporter.log("Logout");
	}

	@Test(priority = 3)
	public void HomePage() {
		System.out.println("checking the Home page");
		Reporter.log("HomePage");
	}
	
     @Test(priority = 1,invocationCount = 5)
	public void ProfilePage() {
		System.out.println("checking the ProfilePage");
		Reporter.log("Prifile");
	}
	
     @Test(priority = 2,enabled = false)
	public void Notification() {
		System.out.println("checking the Notification");
	}
}
