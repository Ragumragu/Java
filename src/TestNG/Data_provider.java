package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	
	public WebDriver driver;
	@Test
	public void browserlaunch() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\ansys dual band\\TestNG\\Driver\\chromedriver.exe");
		driver.get("https://www.facebook.com/login/");
	}

	@Test(dataProvider = "Test_Data")  
	public void login( String user,String pass) {
		//System.out.println(user);
		//System.out.println(pass);
		WebElement username1 = driver.findElement(By.id("email"));
		username1.sendKeys(user);	
		WebElement password1 = driver.findElement(By.id("pass"));
		password1.sendKeys(pass);

	}
	@DataProvider
	public Object[][] Test_Data() {
		return new Object[][] {
			
			{"ragu","123456"},
			{"raja","6789"}
			
		};
		}
			
		
		
	}


