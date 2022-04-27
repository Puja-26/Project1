package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));	
		Actions actions  = new Actions(driver);
//		actions.dragAndDrop(source, target).perform();
		
		actions.moveToElement(source).clickAndHold(source).moveToElement(target).release().perform();
		
		if(target.getText().equals("Dropped!")) {
			System.out.println("Drag and drop operation performed");
		}

	}

}
