package TestNGExample;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenClass {
	
    @BeforeTest
	public  void  openDB() {
		System.out.println("database is opened");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("Database is closed");
		
	}
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	
	@BeforeClass
	public void closeBroser() {
		System.out.println("Browser is is close");
	}
	
	@Test
	public void m1() {
		System.out.println("Method m1");
	}
	
	@Test
	public void m2() {
		System.out.println("method m2");
		
	}
	
	@Test
	public void m3() {
		System.out.println("method m3 ");
	}
	
	

}
