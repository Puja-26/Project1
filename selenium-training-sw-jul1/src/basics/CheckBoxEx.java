package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoqa.com/automation-practice-form");
		
		WebElement checkBox_sports = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		
		if(!checkBox_sports.isSelected()) {
			checkBox_sports.click();
		}
		
		List<WebElement> checkboxes_hobbies = driver.findElements(By.xpath("//input[@type='checkbox']//following::label"));
		
		for(int i=0; i<checkboxes_hobbies.size(); i++) {
			
			if(checkboxes_hobbies.get(i).getText().equals("Music")) {
				checkboxes_hobbies.get(i).click();
			}
		}
		
	}
}
