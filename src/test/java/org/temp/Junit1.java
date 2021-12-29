package org.temp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit1 {
	static	WebDriver driver;


	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public  static void  afteClass() {
		//driver.quit();

	}
	@Before
	public void beforMethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);
	}
	@After
	public void aftMetho() {
		long end = System.currentTimeMillis();
		System.out.println(end);

	}
	@Test
	public void ogin() {
		WebElement r = driver.findElement(By.id("username"));
		r.sendKeys("sujay");
		WebElement pas= driver.findElement(By.id("password"));
		pas.sendKeys("green@123");
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();



}

}
