package PomWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {
	
	
		@FindBy(xpath="//img[@alt='Facebook']") private WebElement  reg_fblogo;
		@FindBy(xpath="//a[text()='Already have an account?']") private WebElement  alredayacc;
		@FindBy(xpath="//a[text()='Sign Up']") private WebElement  sinuplink;
		@FindBy(xpath="//input[@name='firstname']") private WebElement  firstName;
		@FindBy(xpath="//input[@name='lastname']") private WebElement  surname;
        @FindBy(xpath="//input[@name='reg_email__']") private WebElement  mob_email;
		@FindBy(xpath="//input[@type='password']") private WebElement  password;
		@FindBy(xpath="//select[@name='birthday_day']") private WebElement  birthday;
		@FindBy(xpath="//select[@name='birthday_month']") private WebElement  birthmonth;
		@FindBy(xpath="//select[@name='birthday_year']") private WebElement  birthyear;
		@FindBy(xpath="//input[@value='2']") private WebElement  gender_male;
		@FindBy(xpath="//input[@value='1']") private WebElement  gender_female;
		@FindBy(xpath="//button[@name='websubmit']") private WebElement  submitbtn;
		
		
		//Initilization
		public RegistrationPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
			
		}
		
		public void clickFacebooksingupLink() {
			sinuplink.click();
	

       }
		
		public void  VerifyfacebookRegistrationPageFblogo() {
			Assert.assertTrue(reg_fblogo.isDisplayed(), "the facebook logo on registration page is not display");
		 
		}
		
		public void VerifyfacebookRegistrationPageAlredyAccount() {
			Assert.assertTrue(alredayacc.isDisplayed(), "the All reday having on account fb");
			Assert.assertEquals(alredayacc.getText(),"Already have an account?" );
		}	
			
	    public void setfacebookRegistrationPageFirstName() {
	    	firstName.sendKeys("radheshyam");	
	    	
	    	
	    }
	    
	    public void setfacebookRegistratinPageLastName() {
	    	surname.sendKeys("patil");
	    	
	    }
	    
	    public void setfaceboolRegistrationPageMob_Email(String email ) {
	    	mob_email.sendKeys(email);
	    }
	    
	    public void setfacebookRegistrationPagePassword() {
	    	password.sendKeys("radhe123");
	    }
	    
	    public void setfacebookRegistrationPageBirthDay() {
	    	Select bday= new Select(birthday);
	    	Assert.assertTrue(birthday.isDisplayed(), "Birth day drop down is not available");
	    	Assert.assertFalse(birthday.isSelected(), "the birth date is selected initially");
	    	bday.selectByVisibleText("29");
	    }
	    
	    public void setfacebookRegistrationPageBirthMonth() {
	    	Select bmonth= new Select(birthmonth);
	    	Assert.assertTrue(birthmonth.isDisplayed(), "Birth month drop down is not available");
	    	Assert.assertFalse(birthmonth.isSelected(), "the birth month is selected initially");
	    	bmonth.selectByVisibleText("Mar");

	    }
	    public void setfacebookRegistrationPageBirtheYear() {
	    	Select byear= new Select(birthyear);
	    	Assert.assertTrue(birthyear.isDisplayed(), "Birth year drop down is not available");
	    	Assert.assertFalse(birthyear.isSelected(), "the birth year is selected initially");
	    	byear.selectByVisibleText("2010");

	    
	    }	
	    public void setfacebookRegistrationPageGender(String gender) {
	    	if(gender.equalsIgnoreCase("male")) {
	    		gender_male.click();
	    	}else if(gender.contentEquals("female")) {
	    		gender_female.click();	
	    		
	    	}else {
	    		System.out.println("plese select valid input");
	    	}
	    }
	    
	    public void clickfacebokRegistrationPagesubmitbtn() {
	    	Assert.assertTrue(submitbtn.isEnabled());
	    	submitbtn.click();
	    }
			
		}
		
		
