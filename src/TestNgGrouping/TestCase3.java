package TestNgGrouping;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 { 
	
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	
	@BeforeClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("close the Browser");
	}
	
	@Test(groups="Smoke")
	public void test7() {
		System.out.println("Executing test 7");
		
	}
	
	@Test(groups="Functional")
	public void test8() {
		System.out.println("Executing Test8");
	}
	
	@Test(groups= {"Functional","Regression"})
	public void Test9() {
		System.out.println("Executing Test9");
	}

}
