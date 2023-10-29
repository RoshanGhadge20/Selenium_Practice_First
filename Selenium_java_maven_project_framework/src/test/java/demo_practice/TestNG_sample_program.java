package demo_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_sample_program {
	
	WebDriver driver=null;
	@BeforeTest 
	public void setupTest()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Admin//Downloads//chromedriver-win64_ver117.01//chromedriver-win64//chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void Actual_test()
	{
		System.out.println("Actual test is getting started");
		driver.get("https://www.udemy.com/course/selenium-java-framework-from-scratch/learn/lecture/11453750#overview");
		//driver.findElement(By.xpath(""));
	}

	@AfterTest
	public void closetest()
	{
		driver.close();
		System.out.println("Test gets completed");
	}
}
