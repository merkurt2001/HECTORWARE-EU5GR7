package hectorware.stepsdefenitions;

import hectorware.pages.LoginPage;
import hectorware.utilities.Driver;
import hectorware.utilities.ReadConfigurations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user navigate to login page")
    public void the_user_navigate_to_login_page() {
        String url= ReadConfigurations.get("url");
        Driver.get().get(url);
    }

    @When("the user enters username and password")
    public void the_user_enters_username_and_password() {
        String username= ReadConfigurations.get("username");
        String password=ReadConfigurations.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should login successfully to the main page")
    public void the_user_should_login_successfully_to_the_main_page() {
        Assert.assertEquals("Verify user successfuly logged in", "Files - Hectorware - QA",Driver.get().getTitle());
    }
}
