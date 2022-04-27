package testng.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	public class Demo {
		
	}
		WebDriver driver;
		@BeforeMethod
		public void init() {
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://purnadata.in/PurnaDemo/index.php"); // launching
			driver.manage().window().maximize();
		}
		@Test
		public void dropdownTest() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicit																			// wait
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("admin");
			WebDriverWait wait = new WebDriverWait(driver, 25);
			WebElement buttonElement = wait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("submit"))));
			buttonElement.click();	
//			WebElement dropdownCust = driver.findElement(By.id("bill_to"));	
			Thread.sleep(1000);
			driver.findElement(By.id("bill_to")).sendKeys("Sunshine Pvt. Ltd");
		}
		
		@AfterMethod
		public void close() {
			driver.close();
		}
}
