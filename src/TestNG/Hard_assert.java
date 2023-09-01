package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_assert {
	
	@Test(retryAnalyzer = Retry_analyzer.class)//retry analyzer
	public void Hard_assertt() {
		
		String expected ="verification";
		
		String Actual = "verifi";
		
		System.out.println("credential");
		Assert.assertEquals(expected, Actual);
		System.out.println("main_page");
		

	}
	@Test
	public void Hard() {///hard assert 
		
		String expected ="verification";
		
		String Actual = "verification";
		
		System.out.println("credential");
		Assert.assertEquals(expected, Actual);
		System.out.println("pass");
		

	}

}
