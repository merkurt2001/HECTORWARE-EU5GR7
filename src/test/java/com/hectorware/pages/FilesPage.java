package com.hectorware.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage{



    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusSignButton;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public  WebElement uploadFileDropDown;

    @FindBy(xpath = "//*[@class='innernametext' and contains(text(),'TextFile')]")
    public  WebElement checkFile;

    @FindBy(xpath = "//span[@class='icon icon icon-external']")
    public WebElement moveOrcopy;

    @FindBy(className = "icon icon-external")
    public WebElement moveOrCopyOption;

    @FindBy(xpath = "//h2[@class='oc-dialog-title']")
    public WebElement chooseTargetFolder;

    @FindBy(xpath = "//a[@class='icon icon-add button button-add']")
    public WebElement plusIcon;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitArrow;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement moveButton;

    @FindBy(xpath = "//*[@class='innernametext' and contains(text(),'File functionality')]")
    public WebElement newFolder;

    @FindBy(xpath = "//span[contains(text(),'TextFile')]")
    public WebElement movedFile;

    @FindBy(xpath = "//button[contains(text(),'Copy')]")
    public WebElement copyButton;

    @FindBy(xpath = "//a[@class='icon-home']")
    public WebElement homeButton;

    @FindBy(xpath = "//span[@class='icon icon icon-delete']")
    public WebElement deleteOption;

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement deletedFiles;

    @FindBy(xpath = "//*[contains(text(),'TextFile')]")
    public WebElement deletedFile;

    @FindBy(xpath = "//*[contains(text(),'File functionality')]")
    public WebElement deletedFolder;

    @FindBy(xpath = "//input[@value='New folder']")
    public WebElement textInput;

    @FindBy(xpath = "//div[@class='crumb'][1]")
    public WebElement homeIcon;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement iconMoreButton;

    @FindBy(xpath = "//span[@class='innernametext' and contains(text(),'TextFile')]")
    public WebElement fileMoved;




}

