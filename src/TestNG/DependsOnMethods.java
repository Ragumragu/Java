package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	private void cycle() {
		
		System.out.println("cycle");

	}
	@Test(dependsOnMethods = "cycle")
	private void bike() {
		System.out.println("bike");
		

	}
	@Test(dependsOnMethods = "bike")
	private void Car() {
		System.out.println("Car");
		
	}
	@Test(dependsOnMethods = "Car")
	private void bus() {
		System.out.println("bus");
		
	}
	@Test(dependsOnMethods = "bus")
	private void Aeroplane() {
		System.out.println("Aeroplane");
		
	}

}
