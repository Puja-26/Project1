package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountInformationTest extends BaseClass{
	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AccountInformationPage accountInfoPage;
		
		@BeforeMethod
		public void init() {
			initialization();
			loginPage = new LoginPage(driver);
			dashboardPage = new DashboardPage(driver);
			accountInfoPage = new AccountInformationPage(driver);
		}
	
	@Test	
	public void editAccountInfoTest() {
		loginPage.loginToMagento(prop.getProperty("emailId"), prop.getProperty("password"));
		dashboardPage.clickOnEdit();
		accountInfoPage.editAccountInfo();
		Assert.assertEquals(dashboardPage.label_msgAccInfoSaved.getText(), "The account information has been saved");	
	}
	
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
