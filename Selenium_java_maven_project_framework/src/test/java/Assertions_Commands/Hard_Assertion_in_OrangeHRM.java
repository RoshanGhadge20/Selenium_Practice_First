package Assertions_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Hard_Assertion_in_OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver",
				"C://Users//Admin//Downloads//chromedriver-win64_ver117.01//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usr=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		Thread.sleep(3000);
		Assert.assertTrue(usr.isDisplayed());
		Thread.sleep(3000);
		usr.sendKeys("Admin");
		Thread.sleep(3000);
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		Thread.sleep(3000);
		Assert.assertTrue(pass.isDisplayed());
		Thread.sleep(3000);
		pass.sendKeys("admin123");
		Thread.sleep(3000);
		
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		Assert.assertTrue(btn.isDisplayed());
		btn.click();
		
		driver.close();
		
		
	}

}
