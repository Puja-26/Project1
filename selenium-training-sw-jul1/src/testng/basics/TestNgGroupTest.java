package testng.basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNgGroupTest {
	
  @Test(groups={"regression"})
  public void f1() {
	  System.out.println("test1");	  
  }
  
  @Test(groups={"sanity"})
  public void f2() {
	  System.out.println("test2");
  }
  
  @Test(groups={"regression","sanity"})
  public void f3() {
	  System.out.println("test3");
  }
  
  @Test
  public void f4() {
	  System.out.println("test4");
  }
  
  @Test(groups={"regression"})
  public void f5() {
	  System.out.println("test5");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

}
