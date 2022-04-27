package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
	
LoginPage loginPage;
	
	@BeforeMethod
	public void init() {
		initialization();
		loginPage = new LoginPage(driver);
	}
	
	
	@DataProvider
	public Object[][] getValidTestData() {		
		Object[][] data = {{"janardhankaragir@gmail.com","Password@12"}};
		return data;	
	}
	
	
	@Test(dataProvider="getValidTestData")
	public void loginSuccess(String emailId, String dassword) {	
		loginPage.loginToMagento(emailId, dassword);
		Assert.assertEquals(driver.getTitle(), "My Account");
	}
	
	@DataProvider
	public Object[][] getInvalidTestData() {		
		Object[][] data = {{"janardhankaragir@gmail.com","Password@12345"}};
		return data;	
	}
	
	@Test(dataProvider="getInvalidTestData")
	public void loginFail(String emailId, String dassword) {
		loginPage.loginToMagento(emailId, dassword);
		Assert.assertEquals(driver.getTitle(), "Customer Login");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	

}
