package testng.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
	
	
	@Parameters({"browser","url","emailId","password"})
	@Test
	public void magentoLoginTest(String browser, String url, String emailId, String password) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(url);
		WebElement textBox_emailId = driver.findElement(By.id("email"));
		textBox_emailId.sendKeys(emailId);
		WebElement textBox_password = driver.findElement(By.name("login[password]"));
		textBox_password.sendKeys(password);
		WebElement btn_login = driver.findElement(By.id("send2"));
		btn_login.click();
		driver.close();

	}
}

//