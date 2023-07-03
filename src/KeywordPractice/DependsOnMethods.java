package KeywordPractice;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test(priority=1,timeOut = 5000)
	public void OpenBrowser() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("Open the Browser");
	  Assert.fail();
	}
	
	@Test(priority=2,dependsOnMethods = "OpenBrowser" )
	public  void LoginPage() {
		System.out.println("Login the page");
	}
	
	@Test(priority=3,dependsOnMethods = {"OpenBrowser","LoginPage"})
	public void LogoutPage() {
		System.out.println("Logout the Page");
	}


}
