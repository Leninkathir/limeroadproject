package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base_class {
	public static WebDriver dr; 
	Actions act;
	//launch 
	public static WebDriver launch(String brname) {
	if (brname.equalsIgnoreCase("chrome"))	{
		WebDriverManager.chromedriver().setup();
		dr= new ChromeDriver();}
	else if (brname.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		dr=new FirefoxDriver();}
	else if (brname.equalsIgnoreCase("Edge")) {
		WebDriverManager.edgedriver().setup();
		dr=new EdgeDriver();}
	dr.manage().window().maximize();
	return dr;
	}//launch_url
	public static WebDriver launchurl(String url) {
		dr.get(url);
		return dr;
	}//click
	public void clickonelement (WebElement elmnt) {
		elmnt.click();
	}//screenshot
	public void screenshot(String filename) {
		TakesScreenshot ts =(TakesScreenshot) dr;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File ("C:\\Users\\lenin\\eclipse-workspace\\Limeroad\\screenshot\\"+filename);
	try {
		FileHandler.copy(source, dest);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	public void dropdown(WebElement elmnt, String option, String Value) {
		Select sel = new Select(elmnt);
		if (option.equals("value")) {
			sel.selectByValue(Value);
		}
		else if (option.equals("text")) {
			sel.selectByVisibleText(Value);
		}else if (option.equals("index" )) {
			int index = Integer.parseInt(Value);
			sel.selectByIndex(index);
		}
	}
	public void framebyIndex (int index) {
		dr.switchTo().frame(index);
	}
	public void framebyIdorName(String IdorName) {
		 dr.switchTo().frame(IdorName);
	}
	public void framebyElement(WebElement elmnt) {
		dr.switchTo().frame(elmnt);
	}
	public void mouseHover (WebElement elmnt) {
		act = new Actions(dr);
		act.moveToElement(elmnt).build().perform();
	}
	public void handleAlert (String alet, String Alertmsg) {
		if(alet.equals("accept")) {
			Alert alert = dr.switchTo().alert();
			if(alert.getText().equals(Alertmsg)) {
				alert.accept();			
		}}else if (alet.equals("dismiss")) {
			Alert alert = dr.switchTo().alert();
			if(alert.getText().equals(Alertmsg)) {
				alert.dismiss();
		}}}
	public void windowhandling(int index) {
		Set<String> window = dr.getWindowHandles();
		List<String> windowlist = new ArrayList<>(window);
		String win = windowlist.get(index);
		dr.switchTo().window(win);
	}
}
