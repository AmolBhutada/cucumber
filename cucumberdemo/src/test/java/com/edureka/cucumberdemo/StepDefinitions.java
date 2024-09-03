package com.edureka.cucumberdemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class StepDefinitions {

	@Given("^the user is on the login page$")
	public void userIsOnLoginPage() {
		// Code to navigate to the login page
	}

	@When("^the user enters valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void userEntersValidCredentials(String username, String password) {
		// Code to enter valid credentials
	}

	@And("^the user clicks the login button$")
	public void userClicksLoginButton() {
		// Code to click the login button
	}

	@Then("^the user should be logged in successfully$")
	public void userShouldBeLoggedIn() {
		// Code to verify successful login
	}

	@When("^the user enters invalid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void userEntersInvalidCredentials(String username, String password) {
		// Code to enter invalid credentials
	}

	@Then("^the user should see an error message$")
	public void userShouldSeeErrorMessage() {
		// Code to verify the presence of an error message
	}
}
