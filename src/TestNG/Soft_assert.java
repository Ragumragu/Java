package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
	
	@Test
	public void crendials() {
		
		int a=10;
		int b=10;
		System.out.println("pass_1");
		
		SoftAssert s=new SoftAssert();
		
		s.assertEquals(a, b);
		System.out.println("pass_2");
		
		
	}

}
