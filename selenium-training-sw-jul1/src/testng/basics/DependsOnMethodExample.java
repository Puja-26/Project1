package testng.basics;

import org.testng.annotations.Test;

public class DependsOnMethodExample {
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest(){
		System.out.println("Home Page test");
	}
		
	@Test
	public void loginTest(){
		System.out.println("login test");
	}
	
	

}
