package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoqa.com/browser-windows");
		
		String parentWindowHandle =  driver.getWindowHandle();
		System.out.println("parent window handle is: "+parentWindowHandle);
		driver.findElement(By.id("windowButton")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("all window handles: "+windowHandles);
		
		for(String handle : windowHandles) {
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
					String childWindowUrl = driver.getCurrentUrl();	
					System.out.println("child window url is: "+childWindowUrl);
			}
		}
		driver.switchTo().window(parentWindowHandle);
		String parentWindowUrl = driver.getCurrentUrl();	
		System.out.println("parent window url is: "+parentWindowUrl);
		driver.quit();
	}

}
