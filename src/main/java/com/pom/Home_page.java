package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public WebDriver dr;
	@FindBy(xpath="//span[@class='dIb vM wsN owsN fwB']")
	private WebElement shopmen;

	
	public WebElement getShopmen() {
		return shopmen;
}
	
	
	public Home_page(WebDriver driver) {
		dr=driver;
		PageFactory.initElements(dr, this);
	}
}