package hectorware.stepsDefenitions;

import hectorware.pages.FilesPage;
import hectorware.pages.LoginPage;
import hectorware.utilities.ReadConfigurations;
import hectorware.utilities.Driver;
import hectorware.utilities.WebTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.prefs.PreferencesFactory;

public class FileFunctionalityStepsDefs {

    @Given("the user in the login page")
    public void the_user_in_the_login_page() {

        Driver.get().get(ReadConfigurations.get("url"));
        WebTools.waitFor(2);

    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {

        String usernameInput = ReadConfigurations.get("username");
        String passwordInput = ReadConfigurations.get("password");

        new LoginPage().login(usernameInput,passwordInput);
        WebTools.waitFor(2);

    }
    @Then("the files Files page should be displayed")
    public void the_files_Files_page_should_be_displayed() {

        String actualTitle = Driver.get().getTitle().substring(0,4);
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = "File";
        Assert.assertEquals(expectedTitle,actualTitle);
        WebTools.waitFor(2);


    }
    @When("the user clicks the plus sign button")
    public void the_user_clicks_the_plus_sign_button() {


        new FilesPage().plusSignButton.click();
        WebTools.waitFor(2);

    }
    @Then("the user uploads wanted file with upload button option")
    public void the_user_uploads_wanted_file_with_upload_button_option() {


        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/TextFile.txt";
        String fullPath = projectPath+"/"+filePath;
        new FilesPage().uploadFileDropDown.sendKeys(fullPath);
        WebTools.waitFor(2);

    }

    @And("the uploaded file should be displayed in files page")
    public void theUploadedFileShouldBeDisplayedInFilesPage() {
        String checkFileText = new FilesPage().checkFile.getText();
        System.out.println("checkFileText = " + checkFileText);
        Assert.assertEquals("TextFile",checkFileText);
        WebTools.waitFor(2);
    }
    @When("the user clicks on the icon more in front of wanted file")
    public void theUserClicksOnTheIconMoreInFrontOfWantedFile() {
        WebTools.waitFor(2);
        new FilesPage().iconMore.click();
        WebTools.waitFor(2);
    }

    @And("clicks on Move or Copy option")
    public void clicksOnMoveOrCopyOption() {
        new FilesPage().moveOrCopyOption.click();
        WebTools.waitFor(2);
    }

    @Then("the Choose target folder should be displayed")
    public void theChooseTargetFolderShouldBeDisplayed() {
        WebElement chooseTargetFolder = new FilesPage().chooseTargetFolder;
        System.out.println("chooseTargetFolder = " + chooseTargetFolder.getText());
        WebTools.waitFor(2);
    }


    @And("clicks on Move or Copy option from drop down")
    public void clicksOnMoveOrCopyOptionFromDropDown() {

        new FilesPage().moveOrcopy.click();
        WebTools.waitFor(2);
    }

    @When("the user clicks on plus icon")
    public void theUserClicksOnPlusIcon() {
        new FilesPage().plusIcon.click();
        WebTools.waitFor(2);
    }

    @And("the user clicks on submit arrow to create a new folder")
    public void theUserClicksOnSubmitArrowToCreateANewFolder() {
        new FilesPage().submitArrow.click();
        WebTools.waitFor(2);
    }

    @And("the user clicks move button")
    public void theUserClicksMoveButton() {
        new FilesPage().moveButton.click();
        WebTools.waitFor(2);
    }

    @And("the user clicks home icon")
    public void theUserClicksHomeIcon() {
        new FilesPage().homeIcon.click();
        WebTools.waitFor(2);
    }

    @And("the user clicks on newly created folder")
    public void theUserClicksOnNewlyCreatedFolder() {
        new FilesPage().newFolder.click();
        WebTools.waitFor(2);
    }

    @Then("the moved file should be displayed")
    public void theMovedFileShouldBeDisplayed() {
        String text = new FilesPage().movedFile.getText();
        System.out.println("text = " + text);
        WebTools.waitFor(2);

    }

    @When("the user clicks on the copy button")
    public void theUserClicksOnTheCopyButton() {
        new FilesPage().copyButton.click();
        WebTools.waitFor(2);
    }

    @Then("the copied file should be on the files page")
    public void theCopiedFileShouldBeOnTheFilesPage() {
        new FilesPage().copiedFile.isDisplayed();
        WebTools.waitFor(2);
    }
}