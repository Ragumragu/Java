package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrized_2 {
	
	public WebDriver driver;
	@Test
	public void browserlaunch() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\ansys dual band\\TestNG\\Driver\\chromedriver.exe");
		driver.get("https://www.facebook.com/login/");
	}
	
	
	
	@Test
	@Parameters({"username"})
	public void username(@Optional("rolex") String username) {
		WebElement username1 = driver.findElement(By.id("email"));
		username1.sendKeys(username);		
		
	}
	@Test
	@Parameters({"password"})
	public void password(String password) {
		WebElement password1 = driver.findElement(By.id("pass"));
		password1.sendKeys(password);
		
	}
	
		
	

}
