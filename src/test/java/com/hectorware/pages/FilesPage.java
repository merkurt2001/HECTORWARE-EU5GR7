package com.hectorware.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage{



    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusSignButton;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public  WebElement uploadFileDropDown;

    @FindBy(xpath = "//span[contains(text(),'TextFile')]")
    public  WebElement checkFile;

    @FindBy(xpath = "(//tr[@data-file='TextFile.txt']//td//a//a//span)[3]")
    public WebElement iconMore;

    @FindBy(xpath = "//a[@data-action='MoveCopy']")
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

    @FindBy(xpath = "//span[contains(text(),'File functionality')]")
    public WebElement newFolder;

    @FindBy(xpath = "//span[contains(text(),'TextFile')]")
    public WebElement movedFile;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement copyButton;

    @FindBy(xpath = "//span[contains(text(),'TextFile (copy)')]")
    public WebElement copiedFile;

    @FindBy(xpath = "//a[@class='icon-home']")
    public WebElement homeButton;

    @FindBy(xpath = "//a[@data-action=\"Delete\"]")
    public WebElement deleteOption;

    @FindBy(xpath = "//a[@class=\"nav-icon-trashbin svg\"]")
    public WebElement deletedFiles;

    @FindBy(xpath = "//span[contains(text(),'TextFile')]")
    public WebElement deletedFile;

    @FindBy(xpath = "//span[@data-original-title='New folder']")
    public WebElement deletedFolder;

    @FindBy(xpath = "//input[@value='New folder']")
    public WebElement textInput;


}

