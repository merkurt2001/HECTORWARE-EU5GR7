package hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileDisplayPage {


    //ProfileDisplayPage Constructor
    public ProfileDisplayPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    //Locators
    @FindBy(id = "settings")
    public WebElement profile;

    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement settings;

    @FindBy(xpath = "//span[.='Personal info']")
    public WebElement personalInfo;

    @FindBy(id = "displayname")
    public WebElement fullName;


}
