package TestNgGrouping;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest(alwaysRun = true)
	public void openDB() {
		System.out.println("Database is open");
		
  	}
	@BeforeTest(alwaysRun = true)
	public void closeDB() {
		System.out.println("Database is closed");
	}
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	
	@BeforeClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("close the Browser");
	}
	
	@Test(groups="Smoke")
	public void test1() {
		System.out.println("Executing test 1");
		
	}
	
	@Test(groups="Functional")
	public void test2() {
		System.out.println("Executing Test2");
	}
	
	@Test(groups= {"Functional","Regression"})
	public void Test3() {
		System.out.println("Executing Test3");
	}

}
