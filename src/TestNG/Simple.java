package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Test NG

public class Simple {
	public WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		driver=new ChromeDriver();
	}
	@BeforeTest
	public void browser_launch() {
		System.setProperty("webdriver.chrome.driver","E:\\ansys dual band\\TestNG\\Driver\\chromedriver.exe");	
	}
	@BeforeClass
	public void url() {
		driver.get("https://www.amazon.in/");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login");
		
	}
	@Test
	public void search_laptop() {
		WebElement lap = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		lap.sendKeys("laptop");
		
	}
	@Test
	public void mobile() {
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		mobile.sendKeys("mobiles");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	@AfterTest
	public void close() {
		driver.close();
		
	}
	
	
}
