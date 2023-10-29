package Assertions_Commands;
import org.testng.Assert;


import org.testng.annotations.Test;

public class Hard_Assertion {

	@Test
	void test1()
	{
		Assert.assertTrue(true);
		Assert.assertEquals("Roshan", "Roshan");
		Assert.assertFalse(false);
		System.out.println("Test is getting successfully executed");
	}

	public static void main(String[] args)
	{
		Hard_Assertion obj=new Hard_Assertion();
		obj.test1();

	}
}