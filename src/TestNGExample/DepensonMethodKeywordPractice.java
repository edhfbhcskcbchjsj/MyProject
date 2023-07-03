package TestNGExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepensonMethodKeywordPractice {
	
	@Test(priority = 1)
	public void Openurl() {
		System.out.println("url is open");
		Assert.fail();
	}
	
	@Test(priority = 2,dependsOnMethods = "Openurl")
	public void Login() {
		System.out.println("logged in to application");
	}
	
	@Test(priority = 3,dependsOnMethods = {"Openurl","Login"})
	public void logout() {
		System.out.println("logged out in the application");
	}

}
