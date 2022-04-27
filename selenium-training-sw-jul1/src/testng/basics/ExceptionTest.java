package testng.basics;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test(expectedExceptions=ArithmeticException.class)
	public void test1(){
		int a=10/0;
		System.out.println(a);
	}
}
