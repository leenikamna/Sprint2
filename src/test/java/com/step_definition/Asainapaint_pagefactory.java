package com.step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Asainapaint_pagefactory 
{
    static WebDriver driver;

	
	@FindBy(xpath="//*[@data-target='#SHOP']")
	@CacheLookup
	WebElement Shop;

	@FindBy(xpath="//*[@title='ap-shop-mask-and-PPE-thumbnail-asian-paints']")
	@CacheLookup
	WebElement MasksPPE;

	@FindBy(xpath="//*[@class='filterCount-ct']")
	@CacheLookup
	WebElement Filter;

	
	@FindBy(xpath="//*[@title='ap-shop-colour-selection-tool-thumbnail-asian-paints']")
	@CacheLookup
	WebElement ColourSelectionTool;

	@FindBy(xpath="//*[@title='Colour Cosmos']")
	@CacheLookup
	WebElement selectproduct;
	
	@FindBy(xpath="//*[@class='pincode']")
	@CacheLookup
	 WebElement pincode;

	@FindBy(xpath="//*[@rel=\"tab0\"]")
	@CacheLookup
	 WebElement  Shipping;
	
	@FindBy(xpath="//*[@rel=\"tab1\"]")
	@CacheLookup
	 WebElement  Cancellation_and_Returns;
	@FindBy(xpath="//*[@rel=\"tab2\"]")
	@CacheLookup
	 WebElement Loyalty_Rewards;
	
	@FindBy(xpath="//*[@title='ap-shop-p&s-wallpaper-thumbnail-asian-paints']")
	@CacheLookup
	WebElement Peel_and_Stick;

	@FindBy(xpath="//*[@id=\"filterSectionWp\"]/div/div/div[1]/h4")
	@CacheLookup
	WebElement product;
	
	@FindBy(xpath="//*[@id=\"filterSectionWp\"]/div/div/div[2]/h4")
	@CacheLookup
	WebElement colour;
	
	@FindBy(xpath="//*[@id=\"filterSectionWp\"]/div/div/div[3]/h4")
	@CacheLookup
	WebElement price;
	
	
	public WebElement getPrice() {
		return price;
	}

	public void setPrice(WebElement price) {
		this.price = price;
	}

	public WebElement getColour() {
		return colour;
	}

	public void setColour(WebElement colour) {
		this.colour = colour;
	}

	public WebElement getProduct() {
		return product;
	}

	public void setProduct(WebElement product) {
		this.product = product;
	}
	public Asainapaint_pagefactory(WebDriver driver) {
		Asainapaint_pagefactory.driver = driver;
	}
	
	public WebElement getShop() {
		return Shop;
	}
	public void setShop(WebElement shop) {
		Shop = shop;
	}
	public WebElement getMasksPPE() {
		return MasksPPE;
	}
	public void setMasksPPE(WebElement masksPPE) {
		MasksPPE = masksPPE;
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver)
	{
		Asainapaint_pagefactory.driver = driver;
		
	}
	public WebElement getFilter() {
		return Filter;
	}
	public void setFilter(WebElement filter) {
		Filter = filter;
	}
	
	
	public WebElement getPincode() {
		return pincode;
	}
	public void setPincode(WebElement pincode) 
	{
		pincode.sendKeys("423201");
	}
	public WebElement getSelectproduct() {
		return selectproduct;
	}
	public void setSelectproduct(WebElement selectproduct) 
	{
		this.selectproduct.click();
	}
	
   
	public WebElement getShipping() {
		return Shipping;
	}
	public void setShipping(WebElement shipping) {
		Shipping = shipping;
	}
	public WebElement getCancellation_and_Returns() {
		return Cancellation_and_Returns;
	}
	public void setCancellation_and_Returns(WebElement cancellation_and_Returns) {
		Cancellation_and_Returns = cancellation_and_Returns;
	}
	public WebElement getLoyalty_Rewards() {
		return Loyalty_Rewards;
	}
	public void setLoyalty_Rewards(WebElement loyalty_Rewards) {
		Loyalty_Rewards.click();
	}
	public WebElement getColourSelectionTool() {
		return ColourSelectionTool;
	}
	public void setColourSelectionTool(WebElement colourSelectionTool)
	{
		ColourSelectionTool = colourSelectionTool;
	}
		
	public WebElement getPeel_and_Stick() {
		return Peel_and_Stick;
	}
	public void setPeel_and_Stick(WebElement peel_and_Stick) {
		Peel_and_Stick.click();
	}

}
