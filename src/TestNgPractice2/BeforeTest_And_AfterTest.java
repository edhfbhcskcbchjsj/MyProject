package TestNgPractice2;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BeforeTest_And_AfterTest {
	
	@BeforeSuite
	public void EmailConfiguration() {
		System.out.println("Email is comfigured ");
	}
	
	
	@AfterSuite
	public void EmailSend() {
		System.out.println("Email is send");
	}
	
	@BeforeTest
	public void OpenDB() {
		System.out.println("open in Database");
	}
	
	@AfterTest
	public void CloseDB() {
		System.out.println("closed Database");
	}
	

	@BeforeClass
	public  void OpenBrowser() {
		System.out.println("openBrowser");
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("closeBrowser");
	}
	
	
	@Test
	public void m1() {
		System.out.println("method m1");
		Reporter.log("method m1");
	}
	
	@Test
	public void m2() {
		System.out.println("method m2");
		Reporter.log("method m2");
		
	}
	
	@Test
	public void m3() {
		System.out.println("method m3");
		Reporter.log("method m3");
	}
	
	

}
