package PomWithPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage  {

	// Declaration
	
	  @FindBy(xpath = "//img[@alt='Facebook']") private WebElement Login_fblogo;
	  @FindBy(xpath = "//h2[@class='_8eso']") private WebElement facebooktagline;
	  @FindBy(xpath = "//a[text()='Forgotten password?']") private WebElement forgotpassword;
	  @FindBy(xpath = "//a[@rel='async']") private WebElement createnewaccount;
	  @FindBy(xpath = "//input[@id='email']") private WebElement loginemail;
	  @FindBy(xpath = "//input[@id='pass']") private WebElement loginpassword;
	  @FindBy(xpath = "//button[@value='1']") private WebElement loginbtn;
	  @FindBys({@FindBy(xpath = "//div[@id='pageFooterChildren']//li")}) private List<WebElement> loginfooterlinks;
	
	// Initialization
	  
	  public LoginPage(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	  
	// Usage
	  
	  public void VerifyFacebookLoginPageFBlogo() {
		  Assert.assertTrue(Login_fblogo.isDisplayed(), "logo is not displayed on login page");
		  Reporter.log("VerifyFacebookLoginPageFBlogo",true);
	  }
	  
	  public void VerifyFacebookLoginPageTagline() {
		  Assert.assertTrue(facebooktagline.isDisplayed(),"Tagline is not displayed on facebook login page");
		  Reporter.log("VerifyFacebookLoginPageTagline",true);
	  }
	  
	  public void VerifyFacebookLoginPageForgotPasswordLink() {
		  Assert.assertTrue(forgotpassword.isDisplayed(), "forgot password is not available on login page");
		  Reporter.log("VerifyFacebookLoginPageForgotPasswordLink",true);
	  }
	  
	  public void VerifyFacebookLoginPageCreateNewAccountLink() {
		  Assert.assertTrue(createnewaccount.isDisplayed(),"Create new account link is not available on login page");
		  Reporter.log("VerifyFacebookLoginPageCreateNewAccountLink",true);
	  }
	  
	  public void SetFacebookLoginPageEmailorMobile() {
		  Assert.assertTrue(loginemail.isDisplayed(), "facebook login page username field is not present");
		  loginemail.sendKeys("radhe93@gmail.com");
		  Reporter.log("SetFacebookLoginPageEmailorMobile",true);
	  }
	  
	  public void SetFacebookLoginPagePassword() {
		  Assert.assertTrue(loginpassword.isDisplayed(), "facebook login page password field is not present");
		  loginpassword.sendKeys("radhe@123");
		  Reporter.log("SetFacebookLoginPagePassword",true);
	  }
	  
	  public void ClickFacebookLoginPageloginbtn() {
		  Assert.assertTrue(loginbtn.isDisplayed(),"login button is not available on page");
		  Assert.assertTrue(loginbtn.isEnabled(), "login button is not enabled on page");
		  Reporter.log("ClickFacebookLoginPageloginbtn",true);
		  loginbtn.click();
	  }
	  
	  public void VerifyFacebookLoginPageFooterLinks() {
		 Assert.assertEquals(loginfooterlinks.size(), 31);
		  Reporter.log("VerifyFacebookLoginPageFooterLinks",true);
	  }
	  
}



