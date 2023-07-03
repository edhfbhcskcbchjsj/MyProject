package TestNgPractic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo5 {
	
	@Test(priority = 1,timeOut = 5000)
	public void OpenUrl() throws InterruptedException {
		System.out.println("open the url");
		Thread.sleep(6000);
	}
	
	@Test(priority = 2)
	public  void login() {
		System.out.println("login the page ");
	}
	
	@Test(priority = 3)
	public void Logout() {
		System.out.println("logout ");
	}
	
	

}
