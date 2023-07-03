package Practice1111111111111;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowerLonching {
	
public static void main(String[]arg) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\acs\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/reg/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("radhe@12334");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("radhe@123345");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("radhe123@gmail.com");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("radhe123");
	WebElement bday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//    Select s= new Select(bday);
//    s.selectByIndex(18);
//	s.selectByValue("19");
//	s.selectByVisibleText("19");
	
    WebElement byear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
    Select s= new Select(byear);
    List<WebElement> yrs = s.getOptions();
    for(int i=0;i<yrs.size();i++) {
    	String yers = yrs.get(i).getText();
    	System.out.println(i+"  "+yers);
    	
    	
    	
    WebElement sal = driver.findElement(By.xpath("//select[@name='birthday_year']"));
    Select s1=new Select(sal);
    String yer = s.getFirstSelectedOption().getText();
    System.out.println(yer);
    }
	
}

}
