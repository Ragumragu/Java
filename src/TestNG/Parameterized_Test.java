package TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	
	@Test
	@Parameters({"usrname","password"})
	public void credentials(@Optional("dhoni")  String username , int password) {
		System.out.println(username);
		System.out.println(password);
	}

}
