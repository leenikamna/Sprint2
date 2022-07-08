package com.step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import com.test_runner.lib.ExcelSheet;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_step 
{

	private static WebDriver driver;
	private Asainapaint_pagefactory shop;
	ExcelSheet file;

	@Before
	public void openBrowser() throws Exception{
		//launching web browser....

		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver1.exe");

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		shop=new Asainapaint_pagefactory(driver);
		driver.manage().window().maximize();
		file = new ExcelSheet();

		shop=PageFactory.initElements(driver,Asainapaint_pagefactory  .class);
	}

	public static WebDriver edgeDriver() {
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Launching Edge Browser");
		return driver;
	}

	//01
	@Given("User is on Asaianpaint webpage")
	public void user_is_on_Asaianpaint_webpage() throws InterruptedException {
		driver.navigate().to("https://www.asianpaints.com/");
		Thread.sleep(5000);
		// for scroll down
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,2200);");
		Thread.sleep(5000);

	}

	@When("user wants to buy product from shop asianpaint webpage")
	public void user_wants_to_buy_product_from_shop_asianpaint_webpage() 
	{
		System.out.println("User in Asainpaint Website");
	}

	@Then("navigate to welcome page and display all products")
	public void navigate_to_welcome_page_and_display_all_products()
	{
		System.out.println("User in Asainpaint Website");


	}

	//02
	@Given("User is on Asianpaint webpage")
	public void user_is_on_Asianpaint_webpage() throws Exception 
	{
		driver.navigate().to("https://www.asianpaints.com/");
		Thread.sleep(5000);
		// for scroll down
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,2500);");
		Thread.sleep(5000);


	}
	@When("user hover on Shop for explore new functions")
	public void user_hover_on_Shop_for_explore_functions() 
	{
		System.out.println("user hover on shop");		
	}
	@Then("navigate to all option under Shop")
	public void navigate_to_all_option_under_Shop() 
	{
		driver.findElement(By.xpath("//*[@data-target='#SHOP']")).click(); 
		System.out.println("All option for shop are display");
	}
	//03
	@Given("is on Asianpaint webpage")
	public void is_on_Asianpaint_webpage() throws Exception 
	{
		driver.navigate().to("https://www.asianpaints.com/online-shop/PPE.html");
		Thread.sleep(5000);
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,2500);");
		Thread.sleep(5000);

	}

	@When("click on Mask and PPE")
	public void click_on_Mask_and_PPE() throws Exception 
	{
	}
	@Then("navigate to next window")
	public void navigate_to_next_window() 
	{
		System.out.println("Select Mask and PPE");
	}
	//04
	@Given("Asainpaint website is opened")
	public void asainpaint_website_is_opened() throws Exception 
	{
		driver.navigate().to("https://www.asianpaints.com/online-shop/PPE.html");
		Thread.sleep(5000);
		// for scroll down
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,2200);");
		Thread.sleep(5000);
	}

	@When("user click on filters to select desire product")
	public void user_click_on_filters_to_select_desire_product() throws Exception
	{
		System.out.println("click_on_filters");	
		driver.findElement(By.xpath("//*[@class='filter-title']")).click();
	}

	@Then("display all filters available for Mask and PPE kit")
	public void display_all_filters_available_for_Mask_and_PPE_kit() throws Exception 
	{
		driver.findElement(By.xpath("//*[@class=\"accor-title open\"]")).click();

	}

	// 05
	@Given("User is on Asianpaint_shop webpage")
	public void user_is_on_Asianpaint_shop_webpage() throws Exception
	{
		driver.navigate().to("https://www.asianpaints.com/online-shop/colour-selection-tools.html");
		Thread.sleep(5000);
		// for scroll down
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,2000);");
		Thread.sleep(5000);


	}

	@When("choose different colour selection tool")
	public void choose_different_colour_selection_tool() 
	{

		System.out.println("User is able to launch shop_colour selection_tool");
	}

	@Then("select product from colour selection Tool on Shop function")
	public void select_productfrom_colour_selection_Tool_on_Shop_function() 
	{
		// select product
		driver.findElement(By.xpath("//*[@title='Colour Cosmos']")).click();

	}
	//06
	@Given("User is on Colour Selection Tool webpage and select product")
	public void user_is_on_Colour_Selection_Tool_webpage_and_select_product() throws Exception 
	{
		driver.navigate().to("https://www.asianpaints.com/online-shop/colour-selection-tools/asian-paints-colour-cosmos-fan-deck-2200-colours.html");
		Thread.sleep(5000);
		// for scroll down
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,2000);");
		Thread.sleep(5000);

	}

	@When("user enter valid pincode for navigate to next page for buy now")
	public void user_enter_valid_pincode_for_navigate_to_next_page_for_buy_now() throws Exception
	{
		//driver.findElement(By.xpath("//*[@title='Colour Cosmos']")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"productPincode\"]")).sendKeys("423201");
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//*[@id=\"thin-banner-info\"]/ul/li[2]/div[2]/a")).click();
		driver.findElement(By.className("pincode")).sendKeys("423201");

	}

	@Then("user is able to click on buy now button")
	public void user_is_able_to_click_on_buy_now_button() 
	{
		//	//driver.findElement(By.xpath("//*[@id='productPincode']")).sendKeys("423201");
		//	driver.findElement(By.xpath("//*[@id=\"productPincode\"]")).sendKeys("423201");
		//
		//	
		//	//driver.findElement(By.xpath("//*[@class='pincode']")).sendKeys("423201");

	}
	//07 customer policy and FAQ

	@Given("User is on Asianpaint webpage_Shop")
	public void user_is_on_Asianpaint_webpage_Shop() throws Exception 
	{
		driver.navigate().to("https://www.asianpaints.com/online-shop/information.html");

		//driver.findElement(By.xpath("//*[@data-target='#SHOP']")).click(); 
		// for scroll down
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,2000);");
		Thread.sleep(5000);


		System.out.println("User is on Asainpaint webpage");

	}

	@When("user wants to solve queries regarding product details")
	public void user_wants_to_solve_queries_regarding_product_details() throws Exception 
	{
		driver.findElement(By.xpath("//*[@rel=\"tab0\"]")).click(); 

		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@rel=\"tab1\"]")).click(); 

		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@rel=\"tab2\"]")).click(); 

		System.out.println("Launch customer policy and FAQ webpage");

	}

	@Then("cilck on Customer policy and FAQ")
	public void cilck_on_Customer_policy_and_FAQ() throws Exception 
	{
		System.out.println("User is able to click on Customer Policy and FAQ");

	}
	@Then("display options for custmore's queries")
	public void display_options_for_custmore_s_queries() {
	}

	//08 Peel and Stick function
	@Given("User is on Asianpaint webpage_Shop functionality")
	public void user_is_on_Asianpaint_webpage_Shop_functionality() throws Exception
	{
		driver.navigate().to("https://www.asianpaints.com/");

		Thread.sleep(30000);

		driver.findElement(By.xpath("//*[@data-target='#SHOP']")).click(); 
		Thread.sleep(5000);
		// go to  peel and stick
		driver.findElement(By.xpath("//*[@title='ap-shop-p&s-wallpaper-thumbnail-asian-paints']")).click();
		Thread.sleep(30000);
		//product	


	}

	@When("user select peel and stick")
	public void user_select_peel_and_stick() throws Exception 
	{	
		//product fetch from excel
		WebElement product= driver.findElement(By.xpath("//*[@id=\"filterSectionWp\"]/div/div/div[1]/h4"));
		product.click();
		Thread.sleep(30000);
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,2000);");
		Thread.sleep(5000);

		
		if(shop.getProduct().getText().equalsIgnoreCase(file.getData(1, 0, 1)))
		{
		           driver.findElement(By.xpath("//*[contains(@value, 'product/Peelandstickwallpaper')]"))
		           .click();
		}
		
		
		
		
		System.out.println(product.getText());

		System.out.println("done");
	}

	@Then("all available product on  webpage should  display")
	public void all_available_product_on_webpage_should_display() throws Exception 
	{	
		System.out.println("User select product from peel and stick function");

	}

	@Then("select filter option from Product_Colour_Price")
	public void select_filter_option_from_Product_Colour_Price() throws Exception 
	{
		WebElement colour= driver.findElement(By.xpath("//*[@id=\"filterSectionWp\"]/div/div/div[2]/h4"));
		colour.click();
		Thread.sleep(30000);
		
		if(shop.getColour().getText().equalsIgnoreCase(file.getData(1, 2, 1)))
		{
			shop.setColour(colour);
		}
		else if(shop.getColour().getText().equalsIgnoreCase(file.getData(1, 3, 1)))
		{
	           driver.findElement(By.xpath("//*[contains(@value, 'colour/black')]"))
	           .click();
		}
		else if(shop.getColour().getText().equalsIgnoreCase(file.getData(1, 4, 1)))
		{
			driver.findElement(By.xpath("//*[contains(@value, 'colour/brown')]"))
	           .click();
		}
		
		Thread.sleep(5000);
		
		WebElement price = driver.findElement(By.xpath("//*[@id=\"filterSectionWp\"]/div/div/div[3]/h4"));
		colour.click();
		Thread.sleep(30000);
		if(shop.getPrice().getText().equalsIgnoreCase(file.getData(1, 10, 0)))
		{
			driver.findElement(By.xpath("//*[contains(@value, 'price/uptors199')]"))
	           .click();
			shop.setPrice(price);
		}
		
		

	   	}





}

