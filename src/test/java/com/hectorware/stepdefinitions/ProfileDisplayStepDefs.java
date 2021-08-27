package com.hectorware.stepdefinitions;

import com.hectorware.pages.ProfileDisplayPage;
import com.hectorware.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class ProfileDisplayStepDefs {

    @Given("the user navigate to profile - settings module")
    public void the_user_navigate_to_profile_settings_module() {
        ProfileDisplayPage profileSettings = new ProfileDisplayPage();
        profileSettings.profile.click();
        BrowserUtils.waitFor(1);
        profileSettings.settings.click();
        BrowserUtils.waitForPageToLoad(3);
    }

    @Then("the Personal info is displayed")
    public void the_Personal_info_is_displayed() {
        Assert.assertTrue("verify Personal info text on the left isDisplayed", new ProfileDisplayPage().personalInfo.isDisplayed());
    }
}
