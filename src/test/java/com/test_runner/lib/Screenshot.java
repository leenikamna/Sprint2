package com.test_runner.lib;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {
	public static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","‪Drivers\\chromedriver1.exe");

		//Create Browser object
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Pass the URL, call the method
		driver.get("https://www.asianpaints.com/");
		//01 
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Shop");	
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File ("./ScreenShot_store/web_page.png"));
		Thread.sleep(3000);
		
		//02
		
	driver.findElement(By.xpath("//*[@class=\"spriteIcon-Firstfold wishListIcon\"]"))
		.click();	
	Thread.sleep(3000);
		TakesScreenshot ts1 =(TakesScreenshot)driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source1, new File ("./ScreenShot_store/wishlist.png"));
		
		driver.quit();

	}
}

