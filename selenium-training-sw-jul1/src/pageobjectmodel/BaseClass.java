package pageobjectmodel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	WebDriver driver;
	Properties prop;
	
	public BaseClass() {
		prop = new Properties();
		FileInputStream fip;
		try {
			fip = new FileInputStream(new File("D:\\puja\\SeleniumProject\\selenium-training-sw-jul"));
			try {
				prop.load(fip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	public void initialization() {
		if(prop.get("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Driver2\\chromedriver.exe");	
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Driver\\internetExplorerdriver.exe");	
			driver = new InternetExplorerDriver();
		}
				
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
}
