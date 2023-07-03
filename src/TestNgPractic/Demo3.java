package TestNgPractic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo3 {
	
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("Open Broswer");
	}
	
	@AfterClass
	public void CloseBrower() {
		System.out.println("close Broser");
		
	}
	
	@Test
	public void m4() {
		System.out.println("method m4");
	}
	
	@Test
	public void m5() {
		System.out.println("method m5");
	}
	
	@Test
	public void m6() {
		System.out.println("method m6");
	}

}
