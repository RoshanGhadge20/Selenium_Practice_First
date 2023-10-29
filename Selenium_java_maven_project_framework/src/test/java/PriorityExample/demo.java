package PriorityExample;

import org.testng.annotations.Test;

public class demo {
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("I am inside of test 1");
		
	}
	
	@Test(priority=2)
	public void test2()
	{
		System.out.println("I am inside of test 2");
		//Assert.assertTrue(false);
		
	}
	
	@Test
	public void test3()
	
	{
		System.out.println("I am inside of test 3");
		
	}

}
