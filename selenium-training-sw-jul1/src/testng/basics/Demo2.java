package testng.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	}
	
	@Test
	public void login() {
		WebElement textBox_emailId = driver.findElement(By.id("email"));	
		textBox_emailId.sendKeys("janardhankaragir@gmail.com");		
		driver.findElement(By.name("login[password]")).sendKeys("Password@12");
		driver.findElement(By.xpath("//button[contains(@id, 'send')]")).click();
	}
	
	@Test
	public void loginFail() {
		WebElement textBox_emailId = driver.findElement(By.id("email"));	
		textBox_emailId.sendKeys("janardhankaragir@gmail.com");		
		driver.findElement(By.name("login[password]")).sendKeys("Password@12");
		driver.findElement(By.xpath("//button[contains(@id, 'send')]")).click();	
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
