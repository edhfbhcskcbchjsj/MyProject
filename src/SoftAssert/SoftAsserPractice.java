package SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserPractice {
	
	@Test
	public void test1() {
		SoftAssert soft= new SoftAssert();
		String str1="radhe";
		soft.assertEquals(str1, "jadhav");
		System.out.println("str1");
		
		
	}
	
		
		
	}


