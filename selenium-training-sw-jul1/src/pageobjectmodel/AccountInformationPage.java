package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountInformationPage {
	
	public AccountInformationPage(WebDriver driver) {	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "firstname")
	private WebElement txt_firstName;

	@FindBy(id = "lastname")
	private WebElement txt_lastName;

	@FindBy(xpath = "//button[@title='Save']")
	private WebElement btn_save;
	
	@FindBy(id = "current_password")
	private WebElement txtbox_currentPassword;
	
	public void editAccountInfo() {
		txt_firstName.clear();
		txt_firstName.sendKeys("Virat");
		txt_lastName.clear();
		txt_lastName.sendKeys("Kohli");
		txtbox_currentPassword.sendKeys("Password@12");
		btn_save.click();	
	}
}
