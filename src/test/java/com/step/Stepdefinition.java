package com.step;



import com.base.Base_class;
import com.pom.Addtocart;
import com.pom.Home_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefinition extends Base_class {
	Home_page hp = new Home_page(dr);
	Addtocart ac = new Addtocart(dr);
	
	@Given("launch the url {string}")
	public  void launch_the_url(String str) {
		launchurl(str);
	}
	@Given("user clicks the shopmen")
	public void user_clicks_the_shopmen() {
		hp.getShopmen().click();    
	}
	@When("user clicks the Tshirt")
	public void user_clicks_the_tshirt() throws Exception {
		Thread.sleep(3000);
		ac.getTshirt().click();
	   
	}
	@When("user selects the Model")
	public void user_selects_the_model() throws Exception {
		Thread.sleep(3000);
	    ac.getModel().click();
	}
	@When("user selects the Variant")
	public void user_selects_the_variant() throws Exception {
		Thread.sleep(3000);
		ac.getvariant().click();
	}
	@When("user selects the Size")
	public void user_selects_the_size() throws Exception {
		Thread.sleep(3000);
		ac.getSize().click();
	}
	@When("user clicks add_to_cart")
	public void user_clicks_add_to_cart() throws Exception {
		Thread.sleep(3000);
		ac.getcart().click();
	}


}