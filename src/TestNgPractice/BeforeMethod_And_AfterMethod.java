package TestNgPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod_And_AfterMethod {
	
	@BeforeMethod
	public void Login() {
		System.out.println("Login Facebook Page");
		Reporter.log("Login Facebook Page");
	}
	
	@AfterMethod      
	public void Logout() {
		System.out.println("Logout Facebook page");
		Reporter.log("Logout Facebook page");
	}
	
	@BeforeClass
	public  void OpenBrowser() {
		System.out.println("OpenBrowser");
	 }
	
	
	
	@Test
	public void ProfilePage() {
		System.out.println("cheking profile Page");
		Reporter.log("cheking profile Page");
	}
	
	
	@Test
	public void NotificationPage() {
		System.out.println("Cheking Notification");
		Reporter.log("Cheking Notification");
	}

}
