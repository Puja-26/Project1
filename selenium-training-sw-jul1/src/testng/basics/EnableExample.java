package testng.basics;

import org.testng.annotations.Test;

public class EnableExample {
	@Test
	public void f1() {
		System.out.println("test1");
	}

	@Test(enabled=false)
	public void f2() {
		System.out.println("test2");
	}

	@Test
	public void f3() {
		System.out.println("test3");
	}

	@Test
	public void f4() {
		System.out.println("test4");
	}
}
