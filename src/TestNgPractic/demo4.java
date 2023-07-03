package TestNgPractic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo4 {
	
	
	@Test(priority = 1)
	public void OpenUrl() {
		System.out.println("open the url");
		Assert.fail();
	}
	
	@Test(priority = 2,dependsOnMethods = "OpenUrl" )
	public  void login() {
		System.out.println("login the page ");
	}
	
	@Test(priority = 3,dependsOnMethods = {"OpenUrl","login"})
	public void Logout() {
		System.out.println("logout ");
	}

}
