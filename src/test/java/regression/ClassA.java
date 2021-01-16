package regression;

import org.testng.annotations.Test;

public class ClassA
{
	@Test(priority=1)
	void m1()
	{
		System.out.println("Method m1() inside Regression Class A");
	}
	@Test(priority=3)
	void m2()
	{
		System.out.println("Method m2() inside Regression Class A");
	}
	@Test(priority=2)
	void aTest()
	{
		System.out.println("A Test");
	}
}
