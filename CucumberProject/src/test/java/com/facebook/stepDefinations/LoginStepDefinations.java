package com.facebook.stepDefinations;

import com.facebook.pageObjects.LoginPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinations extends LoginPageObject {

	LoginPageObject lpo = new LoginPageObject();

	@Given("^I am user of a facebook application$")
	public void i_am_user_of_a_facebook_application() throws Throwable {
		lpo.openurl();

	}

	@When("^I enter valid user name$")
	public void i_enter_valid_user_name() throws Throwable {
		lpo.enterusername();
	}

	@When("^I enter valid password$")
	public void i_enter_valid_password() throws Throwable {
		lpo.enterpassword();
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		lpo.clickloginbutton();
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		lpo.Verifylogin();
	}

	@Then("^Close the driver$")
	public void close_the_driver() throws Throwable {
		lpo.close();
	}

}
