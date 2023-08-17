package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	public WebDriver dr;
	@FindBy(xpath="//div[@class='loaderCat viptshirtLdr dIb mA pA r0   h80 b4 l0 t0 ']")
	private WebElement Tshirt;
	public WebElement getTshirt() {
		return Tshirt;
}
	@FindBy(xpath="//img[@data-src='//img0.junaroad.com/stories/story_p_64c761aefd1d3c6f349bed3f-1691433372.jpeg']")
	private WebElement Model; 
	public WebElement getModel() {
		return Model;
	}
	@FindBy(xpath="//img[@alt='purple solid tshirt']")
	private WebElement Variant; 
	public WebElement getvariant() {
		return Variant;
	}
	@FindBy(xpath="//span[@id='size_30274873']")
	private WebElement Size; 
	public WebElement getSize() {
		return Size;
	}
	@FindBy(xpath="//div[@data-pgn='Add to Cart']")
	private WebElement cart; 
	public WebElement getcart() {
		return cart;
	}
	public Addtocart(WebDriver driver) {
		dr=driver;
		PageFactory.initElements(dr, this);
	}
}


