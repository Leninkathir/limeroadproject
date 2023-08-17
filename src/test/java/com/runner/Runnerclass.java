package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "C:\\Users\\lenin\\eclipse-workspace\\Limeroad\\src\\test\\java\\com\\feature\\lime.feature",
glue = "com.step",
dryRun =false,strict = true,plugin = {"pretty","json:Report/limeroad.json",
		"html:Report/limewroad.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
	public class Runnerclass extends Base_class{
	@BeforeClass
		public static void launch() {
			launch("chrome");
}
}
