package pipelines.pipes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class job1 {
	public static WebDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser() {
		driver=new ChromeDriver();
		
		}
	@Test
	public void test1() {
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		 System.out.println(System.getProperty("java.class.path"));
	}
	@Test
	public void test2() {
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		}
	@Test
	public void test3() {
		driver.get("http://www.redbus.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		}
	@AfterMethod
	public void test4() {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.quit();
	
		
}}
