package TestNgGrouping;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {
	
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
	
	@BeforeClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("close the Browser");
	}
	
	@Test(groups="Smoke")
	public void test4() {
		System.out.println("Executing test 4");
		
		
		
	}
	
	@Test(groups="Functional")
	public void test5() {
		System.out.println("Executing Test5");
	}
	
	@Test(groups= {"Functional","Regression"})
	public void Test6() {
		System.out.println("Executing Test6");
	}
	
	

}
