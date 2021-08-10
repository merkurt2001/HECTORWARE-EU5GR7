package hectorware.pages;

import hectorware.utilities.WebTools;
import hectorware.utilities.Driver;
import hectorware.utilities.WebTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage(){

        PageFactory.initElements(Driver.get(),this);
    }


    public void navigateToTab(String tab) {
        String tabLocator = "//a[contains(text(),'"+tab+"')]";

        try {
            WebTools.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            WebTools.clickWithWait(By.xpath(tabLocator), 5);
        }

    }




}
