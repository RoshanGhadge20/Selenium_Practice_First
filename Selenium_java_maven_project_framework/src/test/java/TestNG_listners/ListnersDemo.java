package TestNG_listners;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG_listners.TestNGListners.class)
public class ListnersDemo {

	@Test
	public void test1()
	{
		System.out.println("I am inside of test 1");
		
	}
	
	@Test
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
