package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.Base;

public class Login extends Base{
	
	WebDriver driver ;
	
	@Given("^Open any Browser$")
    public void open_any_browser() throws IOException  {
	driver = initializeBrowser();
    }

    @When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
    public void user_enters_username_as_something_and_password_as_something_into_the_fields(String email, String password)  {
        throw new PendingException();
    }

    @Then("^Verify user is able to successfully login$")
    public void verify_user_is_able_to_successfully_login()  {
        throw new PendingException();
    }

    @And("^Navigate to Login page$")
    public void navigate_to_login_page()  {
        throw new PendingException();
    }

    @And("^User clicks on Login button$")
    public void user_clicks_on_login_button()  {
        throw new PendingException();
    }


}
