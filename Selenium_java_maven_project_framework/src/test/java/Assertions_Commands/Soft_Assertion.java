package Assertions_Commands;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Soft_Assertion
{

	SoftAssert sa=new SoftAssert();
	
	
	@Test
	void test2()
	{
		sa.assertTrue(true);
		sa.assertEquals("Roshan", "Ghadge");
		System.out.println("Successfully completed");
		sa.assertAll();
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Soft_Assertion obj=new Soft_Assertion();
		obj.test2();
	}

}
