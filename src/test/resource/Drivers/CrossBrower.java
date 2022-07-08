package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrower 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver","‪‪C:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.asianpaints.com/");
		System.out.println(driver.getTitle());
	}
	
}

