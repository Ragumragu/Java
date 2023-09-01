package TestNG;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Exception_Test {
	@Test(expectedExceptions = ArithmeticException.class)
	public void simpel() {
		 int a=10;
		 if (a==10) {
			 System.out.println(a/0);
			
		}
		 
	}

}
