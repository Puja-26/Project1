package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		driver.findElement(By.name("alert")).click();
		
		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		alert.accept(); // simple alert

		// confirmation alert
		driver.findElement(By.name("confirmation")).click();

		Thread.sleep(3000);
		alert.dismiss();
		
		// prompt alert
		driver.findElement(By.name("prompt")).click();
		Thread.sleep(3000);
		alert.sendKeys("Hello");
		alert.accept();

	}

}
