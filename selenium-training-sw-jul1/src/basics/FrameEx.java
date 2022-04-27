package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("total number of frames: "+frames.size());
	
		driver.switchTo().frame("frame2");
		WebElement dropdown_animals = driver.findElement(By.id("animals"));
		Select select = new Select(dropdown_animals);
		select.selectByVisibleText("Avatar");
		
		driver.switchTo().defaultContent();  //switch back to main window
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();  //switch to parent frame
		driver.findElement(By.xpath("//input[@type='text']")).clear();
			
//		driver.switchTo().defaultContent();
//		String text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
//		System.out.println(text);
	}
}
