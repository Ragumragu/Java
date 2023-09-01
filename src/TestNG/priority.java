package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class priority {
	public WebDriver driver;
	@Test(priority = -2)
	private void cricket() {
		driver = new ChromeDriver();
		

	}
	@Test(priority = 2)
	private void football() {
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("@raguragu");
		

	}
	@Test(priority = -1)
	private void vollyball() {
		System.setProperty("webdriver.chrome.driver","E:\\ansys dual band\\TestNG\\Driver\\chromedriver.exe");
		

	}
	@Test(priority = 1)
	private void tennies() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("6382564536");
		
		

	}
	@Test(priority = 0)
	private void carem() {
		driver.get("https://www.facebook.com/login/");
		
	}
	@Test(priority = 3)
	private void race() {
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
	}

}
