package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	    @Given("^user is on netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable
	    {
	        System.out.println("landing page");
	    }

	    @When("^user login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String username, String password) throws Throwable
	    {
	       System.out.println(username +" "+ password);
	    }

	    @Then("^homepage is populated$")
	    public void homepage_is_populated() throws Throwable
	    {
	        System.out.println("homepage");
	    }

	    @And("^cards displayed \"([^\"]*)\"$")
	    public void cards_displayed_something(String condition) throws Throwable
	    {
	        System.out.println(condition);
	    }

	}