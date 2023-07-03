package PomWithPageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
	WebDriver driver;
	
	@BeforeClass
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acs\\Desktop\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
	     driver= new ChromeDriver();
	     driver.get("https://www.facebook.com");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public void teardown() {
		//driver.close();
	}
	
	@Test
	public void facebookRegistrationPagetest() {
		RegistrationPage rp= new RegistrationPage(driver);
	  	rp.VerifyfacebookRegistrationPageFblogo();
	  	rp.clickFacebooksingupLink();
		rp.VerifyfacebookRegistrationPageAlredyAccount();
		rp.setfacebookRegistrationPageFirstName();
		rp.setfacebookRegistratinPageLastName();
		rp.setfaceboolRegistrationPageMob_Email("");
		rp.setfacebookRegistrationPagePassword();
		rp.setfacebookRegistrationPageBirthDay();
		rp.setfacebookRegistrationPageBirthMonth();
		rp.setfacebookRegistrationPageBirtheYear();
	    rp.setfacebookRegistrationPageBirtheYear();
		rp.setfacebookRegistrationPageGender("male");
		//rp.clickfacebokRegistrationPagesubmitbtn();
	}

}
