package PomWithPageFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest  {
	
	WebDriver driver;
		
		@BeforeClass
		public void Setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\acs\\Desktop\\selenium jar file\\cromJar file\\chromedriver.exe");
		     driver= new ChromeDriver();
		     driver.get("https://www.facebook.com");
		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
	}
	
	@AfterClass
	public void Teardown() {
		//TestBase.driver.close();
	}
	
	@Test
	public void FcebookLoginPageTest() {
		LoginPage pl = new LoginPage(driver);
		pl.VerifyFacebookLoginPageFBlogo();
		pl.VerifyFacebookLoginPageTagline();
		pl.VerifyFacebookLoginPageForgotPasswordLink();
		pl.VerifyFacebookLoginPageCreateNewAccountLink();
		pl.SetFacebookLoginPageEmailorMobile();
		pl.SetFacebookLoginPagePassword();
		pl.ClickFacebookLoginPageloginbtn();
		pl.VerifyFacebookLoginPageFooterLinks();
	}	
}



