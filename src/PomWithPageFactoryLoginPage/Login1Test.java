package PomWithPageFactoryLoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PomWithPageFactory.LoginPage;
public class Login1Test {
	 WebDriver driver;
	
	@BeforeClass
    public void SetUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acs\\Desktop\\selenium jar file\\cromJar file\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    }
	
	@AfterClass
	public void tredDown() {
		driver.close();
	}
	
	@Test
	public void FacebookLoginPageTest() {
		LoginPage lp1= new LoginPage(driver);
		lp1.VerifyFacebookLoginPageFBlogo();
		lp1.VerifyFacebookLoginPageTagline();
		lp1.VerifyFacebookLoginPageCreateNewAccountLink();
		lp1.SetFacebookLoginPagePassword();
		lp1.VerifyFacebookLoginPageFooterLinks();
		lp1.SetFacebookLoginPagePassword();
	    lp1.VerifyFacebookLoginPageForgotPasswordLink();
		lp1.ClickFacebookLoginPageloginbtn();
	}
}
