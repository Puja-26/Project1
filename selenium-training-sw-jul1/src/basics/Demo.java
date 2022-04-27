package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
		
		String title = driver.getTitle();
		System.out.println("page title is: "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("url is: "+url);
		
		String pageSource = driver.getPageSource();
		System.out.println("page source is: "+pageSource);
//		driver.close();
		driver.quit();
	}
}
