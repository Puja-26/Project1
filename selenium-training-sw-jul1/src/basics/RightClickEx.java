package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		WebElement btn_rightClick = driver.findElement(By.id("rightClickBtn"));
		
		Actions actions  = new Actions(driver);
		actions.contextClick(btn_rightClick).perform();
		
		if(driver.findElement(By.id("rightClickMessage")).isDisplayed()) {
			System.out.println("Right click action is performed");
		}
	}

}
