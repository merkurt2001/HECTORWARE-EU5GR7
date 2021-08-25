package hectorware.pages;

import hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaitLoginPage {

    //LoginPage Constructor
    public SaitLoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    //Locators
    @FindBy(id="user")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement submit;

    public void login(String userNameStr, String passwordStr) {
        username.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }


}
