package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountTest {

	// Execute single test case 5 times

	@Test(invocationCount=5)
	public void sum() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.demoguru99.com/index.php/");
		driver.close();
	}
}
