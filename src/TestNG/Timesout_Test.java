package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timesout_Test {
	
	public WebDriver driver;
	
	@Test(timeOut = 4000)
	public void bikee() throws InterruptedException {
		System.out.println("ninja");
		Thread.sleep(1000);
		System.out.println("kawaski");
		
	}
	@Test
	public void car() throws InterruptedException {
		System.out.println("honda");
		Thread.sleep(4000);
		System.out.println("bmw");
		

	}
	/*@Test
	public void setup() {
	
	driver= new ChromeDriver();
	}
	@Test
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver","E:\\ansys dual band\\TestNG\\Driver\\chromedriver.exe");

	}
	@Test
	public void geturl()  {
	driver.get("https://www.facebook.com/login/");
		
	}*/

}
