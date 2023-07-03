package PomWithPageFactoryLoginPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage1 {
	
	@FindBy(xpath="value")private WebElement Login_fblogo;
	@FindBy(xpath="value")private WebElement Login_fbTagLine;
	@FindBy(xpath="value")private WebElement UserName;
	@FindBy(xpath="value")private WebElement Password;
	@FindBy(xpath="value")private WebElement Login_btn;
	@FindBy(xpath="value")private WebElement forgot_password;
	@FindBy(xpath="value")private WebElement create_account;
	@FindBys({@FindBy(xpath="value")})private List<WebElement>footerLinks;
	
	//initialization
	
	public void  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void VerifyFactoryFacebookLoginPageLogo() {
		Assert.assertTrue(Login_fblogo.isDisplayed(), "The fb logo on login not displayed");
	}
	
	
	public void VerifyFacebookLoginPagefbTagline() {
		Assert.assertTrue(Login_fbTagLine.isDisplayed(),"the fb Tagline is not displyed");
	    Assert.assertEquals(Login_fbTagLine.getText(), "facebook help you....");
	
	}
	
	public  void VerifyFacebookLoginPageforgot_password() {
		Assert.assertTrue(forgot_password.isDisplayed(), "the password forget is displayed");
	    Assert.assertEquals(forgot_password.getText(), "Facebook helps you");
	    forgot_password.click();
	
	}
	
	public void VerifyFacebookLoginPageCreate_account() {
		Assert.assertTrue(create_account.isDisplayed(), "Create New_account button is not displyed");
	    Assert.assertTrue(create_account.isEnabled(), "create new account");
	    Assert.assertEquals(create_account.getText(), "Create new Account");
	}
	
	public void SetFacebookLoginUsername() {
		Assert.assertTrue(UserName.isDisplayed(), "userName text field is not  Displyed");
		UserName.sendKeys("radhe@123");
	}
	
	
	
	public void SetFacebookLoginPagePassword() {
		Assert.assertTrue(Password.isDisplayed(),"password text field is not Displyed");
		Password.sendKeys("radhe238dbdbd@123");
	
	}
	
	public  void SetFacebookLoginPageLogin_btn() {
		Assert.assertTrue(Login_btn.isDisplayed(), "Loginbtn is not Displyed");
		Login_btn.click();
		
	}
	
	public void VerifyFacebookLoginfooterLinks() {
		Assert.assertEquals(footerLinks.size(), "31");
	}
	
	
	
	
	
	
	
	
	

}
