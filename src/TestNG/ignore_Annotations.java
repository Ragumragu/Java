package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignore_Annotations {
	//ignore
	@Ignore
	@Test
	public void javaa() {
		System.out.println("java");
		
	}
	@Ignore
	@Test
	public void selenium() {
		System.out.println("selenium");
		
	}
	@Test(enabled=false)
	public void cucumber() {
		System.out.println("cucumber");
		
	}
	@Test
	public void maven() {
		System.out.println("maven");
		

	}
	@Test
	public void automation() {
		System.out.println("automation");
		
	}
	@Test
	public void manual() {
		System.out.println("manual");
		
	}
	

}
