package testng.basics;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 1)
	public void f1() {
		System.out.println("test1");
	}

	@Test(priority = -2)
	public void f2() {
		System.out.println("test2");
	}

	@Test(priority = 2)
	public void f3() {
		System.out.println("test3");
	}

	@Test(priority = -1)
	public void f4() {
		System.out.println("test4");
	}

	@Test
	public void f() {
		System.out.println("test5");
	}
	
	@Test
	public void a1() {
		System.out.println("testa1");
	}
}
