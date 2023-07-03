package TestNgPractic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	
	@BeforeTest
	public void OpenDB() {
		System.out.println("Open the DB");
		
	}
	
	@AfterTest
	public void ClosedDB() {
		System.out.println("Closed the DB");
		
		
	}
	
	@BeforeClass
	public void OpenBrower() {
		System.out.println("open  the Brower");
		
	}
	
	@AfterClass
	 public void ClosedBrower() {
		 System.out.println("close the browser");
	 }
	
	@BeforeSuite
	public void configrateEmail() {
		System.out.println("email");
	}
	
	@AfterSuite
	public void sendEmail() {
	 System.out.println("send email");	
	
	}
	 
	 @Test
	 public void m1() {
		  System.out.println("method m1");
	 }
     
	 
	 @Test
	 public void m2() {
		 System.out.println("method m2");
	 }
	 
	 @Test
	 public void m3() {
		 System.out.println("method m3");
	 }
}
