package TestNgPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClass_And_AfterClass {
	
	@BeforeClass
	public void Login() {
		System.out.println("Login Facebook Page");
		Reporter.log("Login Facebook Page");
	}
	
	@AfterClass    
	public void Logout() {
		System.out.println("Logout Facebook page");
		Reporter.log("Logout Facebook page");
	}
	
	@Test
	public void HomePage() {
		System.out.println("checking home page");
		Reporter.log("checking home page");
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
