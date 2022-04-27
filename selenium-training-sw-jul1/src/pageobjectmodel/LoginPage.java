package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")              //driver.findElement(By.
	WebElement textBox_emailId;
	
	@FindBy(name="login[password]")
	WebElement textBox_password;
	
	@FindBy(xpath="//button[contains(@id, 'send')]")
	WebElement btn_login;
	
	
	public void loginToMagento(String emailId, String passowrd) {
		textBox_emailId.sendKeys(emailId);
		textBox_password.sendKeys(passowrd);
		btn_login.click();
	}
}
