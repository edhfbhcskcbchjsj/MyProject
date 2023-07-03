package KeywordPractice;

import org.testng.annotations.Test;

public class Privority {
	
	@Test(priority=1)
	public void OpenBrowser() {
		System.out.println("Open the Browser");
	}
	
	@Test(priority=2)
	public  void LoginPage() {
		System.out.println("Login the page");
	}
	
	@Test(priority=3)
	public void LogoutPage() {
		System.out.println("Logout the Page");
	}

}
