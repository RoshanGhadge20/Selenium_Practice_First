package demo_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_driver_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver=new ChromeDriver();
//		driver.get("https://www.udemy.com/course/selenium-java-framework-from-scratch/learn/lecture/11230386#overview");
//		driver.manage().window().maximize();
//		System.out.println();
//	
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("www.google.com");
		
		driver.close();
		
	}

}
