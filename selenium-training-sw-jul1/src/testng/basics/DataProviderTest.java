package testng.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	WebDriver driver;

	@DataProvider
	public Object[][] getTestData() {		
		Object[][] data = {{"janardhankaragir@gmail.com","Password@12"}, {"abc@gmail.com", "1234asdf"}};
		return data;	
	}
	
	// data driven testing
	@Test(dataProvider="getTestData")
	public void loginTest(String emailId, String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(emailId);
		driver.findElement(By.name("login[password]")).sendKeys(password);
		driver.findElement(By.id("send2")).click();
		Assert.assertEquals(driver.getTitle(), "My Account");
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}

//return new Object[][] { { "janardhankaragir@gmail.com", "Password@12" }, { "admin@gmail.com", "admin" } };