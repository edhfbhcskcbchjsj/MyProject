package KeywordPractice;

import org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvoctionCount {
	
	private static final boolean False = false;

	@BeforeClass
	public void LonchBrowser() {
		System.out.println("Lonch the Browser");
	}
	
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Closed the Browser");
	}
	
	@BeforeMethod
	public void LoginPage() {
		System.out.println("Login_page");
	}
	
	@AfterMethod
	public void LogoutPage() {
		System.out.println("LogOut_Page");
	}
	
	
	@Test(priority=1)
	public void HomePage() {
		System.out.println("Homepage");
	}

	@Test(priority = 2,invocationCount = 5,enabled =False)
	public void Notification() {
		System.out.println("Notification");
	}
	


}
