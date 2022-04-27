package testng.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://purnadata.in/PurnaDemo/index.php"); // launching
		driver.manage().window().maximize();
	}
	
	@Test (priority=0)
	public void loginSuccess() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicit																			// wait
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement buttonElement = wait
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("submit"))));
		buttonElement.click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//h4[text()='Sale Invoice Details']")).getText(), "Sale Invoice Details");
		
	}
	
	@Test (priority=1)
	public void loginfailure() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicit																			// wait
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("adm");
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement buttonElement = wait
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("submit"))));
		buttonElement.click();	
	}
	
	@Test(priority=2)
	public void AtitleCheck() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicit																			// wait
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement buttonElement = wait
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("submit"))));
		buttonElement.click();
		String title = driver.getTitle();
		System.out.println(title);		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
