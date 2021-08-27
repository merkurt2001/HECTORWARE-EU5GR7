package com.hectorware.stepdefinitions;

import com.hectorware.pages.FilesPage;
import com.hectorware.utilities.WebTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class FileFunctionalityStepsDefs {


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


    @And("the user clicks home icon")
    public void theUserClicksHomeIcon() {
        new FilesPage().homeButton.click();
        WebTools.waitFor(2);
    }

    @And("clicks on Delete option")
    public void clicksOnDeleteOption() {
        new FilesPage().deleteOption.click();
        WebTools.waitFor(2);
    }


    @When("the user clicks on Deleted files")
    public void theUserClicksOnDeletedFiles() {
        new FilesPage().deletedFiles.click();
        WebTools.waitFor(2);
    }


    @Then("the deleted file should be found under deleted files")
    public void theDeletedFileShouldBeFoundUnderDeletedFiles() {
        String text = new FilesPage().deletedFile.getAttribute("value");
        System.out.println("text = " + text);
        Assert.assertEquals("TextFile",text);
        WebTools.waitFor(2);
    }

    @Then("the deleted folder should be found under deleted files")
    public void theDeletedFolderShouldBeFoundUnderDeletedFiles() {
        String text = new FilesPage().deletedFolder.getText();
        System.out.println("text = " + text);
        Assert.assertEquals("New folder",text);
        WebTools.waitFor(2);
    }

    @And("the user names the the folder")
    public void theUserNamesTheTheFolder() {
        new FilesPage().textInput.sendKeys("File functionality");
        WebTools.waitFor(2);
    }

    @And("the user cliks on home icon button")
    public void theUserCliksOnHomeIconButton() {
        new FilesPage().homeIcon.click();
    }
}
