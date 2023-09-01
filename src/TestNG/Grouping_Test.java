package TestNG;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups = "transport")
	private void bus() {
		
	}
	@Test(groups = "transport")
	private void car() {
		
	}
	@Test(groups = "transport")
	private void truck() {
		

	}
	@Test(groups = "transport")
	private void train() {
		

	}
	@Test(groups = "foods")
	private void biriyani() {
		

	}
	@Test(groups = "foods")
	private void noodels() {
		
	}
	@Test(groups = "foods")
	private void dosa() {
		
	}

}
