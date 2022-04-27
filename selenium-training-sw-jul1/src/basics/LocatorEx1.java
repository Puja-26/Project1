package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
		
		WebElement textBox_emailId = driver.findElement(By.id("email"));	
		textBox_emailId.sendKeys("janardhankaragir@gmail.com");
		
		driver.findElement(By.name("login[password]")).sendKeys("Password@12");
//		driver.findElement(By.className("button")).click();
		driver.findElement(By.xpath("//button[contains(@id, 'send')]")).click();
	}
}
