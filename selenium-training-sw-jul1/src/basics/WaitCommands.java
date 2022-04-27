package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	//implicitly wait
		driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);  //PageLoad Timeoutwait
		
//		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("janardhankaragir@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Password@12");	
		
		WebDriverWait wait = new WebDriverWait(driver, 25);  //explicit wait
		WebElement btn_login = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("send2"))));
		btn_login.click();
	}
}
