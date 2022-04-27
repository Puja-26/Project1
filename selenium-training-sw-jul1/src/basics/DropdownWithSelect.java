package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownWithSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/mobile.html");
		
		WebElement dropdown_sortBy = driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));
//		dropdown_sortBy.sendKeys("Price");
		
		Select select = new Select(dropdown_sortBy);
//		select.selectByVisibleText("Price");
//		select.selectByIndex(1);
		
	}

}
