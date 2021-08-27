package com.hectorware.stepdefinitions;

import com.hectorware.pages.ProfileDisplayPage;
import com.hectorware.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfileFullNameStepDefs {

    @When("the user changes the full name as {string}")
    public void the_user_changes_the_full_name_as(String newFullName) {
        ProfileDisplayPage profileDisplayPage = new ProfileDisplayPage();
        profileDisplayPage.fullName.clear();
        profileDisplayPage.fullName.sendKeys(newFullName);
        BrowserUtils.waitFor(1);
    }

    @Then("the full-name info changed under Profile-Settings")
    public void the_full_name_info_changed_under_Profile_Settings() {
        Assert.assertEquals("verify the full name changed as John Smith", "John Smith", new ProfileDisplayPage().fullName.getAttribute("value"));
    }
}
