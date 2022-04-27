package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public DashboardPage(WebDriver driver) {	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@href='http://live.demoguru99.com/index.php/customer/account/edit/'])[2]")   
	WebElement link_editAccInfo;
	
	@FindBy(xpath="//span[text()='The account information has been saved.']")   
	WebElement label_msgAccInfoSaved;
	
	public void clickOnEdit() {
		link_editAccInfo.click();
	}
	
	

}
