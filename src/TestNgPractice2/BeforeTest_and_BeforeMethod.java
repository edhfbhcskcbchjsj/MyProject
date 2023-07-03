package TestNgPractice2;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeTest_and_BeforeMethod {
	
	
	@BeforeClass
	public  void OpenBrowser() {
		System.out.println("openBrowser");
		
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("closeBrowser");
	}
	
	
	
	@Test
	public void m4() {
		System.out.println("method m4");
		Reporter.log("method m4");	
		}
	
	@Test
	public void m5() {
		System.out.println("method m5");
		Reporter.log("method m5");
	}
	
    @Test
	public void m6() {
         System.out.println("method m6");
         Reporter.log("method m6");
	}

}
