package TestNG_MultiBroswser;

import org.testng.annotations.Test;

public class example {

	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("I am inside of test 1");
		
	}
	
	@Test(groups = {"sanity","regression"})
	public void test2()
	{
		System.out.println("I am inside of test 2");
		//Assert.assertTrue(false);
		
	}
	
	@Test(groups = {"somke"})
	public void test3()
	
	{
		System.out.println("I am inside of test 3");
		
	}
}
