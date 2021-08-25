package hectorware.stepsdefenitions;

import com.hectorware.pages.LoginPage;
import com.hectorware.utilities.ConfigurationReader;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user navigate to login page")
    public void the_user_navigate_to_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters username and password")
    public void the_user_enters_username_and_password() {
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should login successfully to the main page")
    public void the_user_should_login_successfully_to_the_main_page() {
        Assert.assertEquals("Verify user successfuly logged in", "Files - Hectorware - QA",Driver.get().getTitle());
    }
}
