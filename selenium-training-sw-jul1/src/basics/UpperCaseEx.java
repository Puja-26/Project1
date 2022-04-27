package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpperCaseEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
		
		WebElement textBox_email = driver.findElement(By.id("email"));
		
		Actions actions  = new Actions(driver);
//		actions.keyDown(textBox_email, Keys.SHIFT);
//		actions.sendKeys("selenium");
//		actions.keyUp(Keys.SHIFT);
//		actions.perform();	
		
		actions.keyDown(textBox_email, Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).perform();
	}

}
