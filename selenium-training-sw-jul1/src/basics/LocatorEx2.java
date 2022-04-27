package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
		
//		driver.findElement(By.linkText("Forgot Your Password?")).click();
//		driver.findElement(By.partialLinkText("Forgot Your")).click();
		
		
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<links.size(); i++) {
			System.out.println(links.get(i).getText());
		}	
	}
}
