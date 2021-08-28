package com.hectorware.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebTools {

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void rightClick(WebElement element) {
        new Actions(com.hectorware.utilities.Driver.get()).contextClick(element).perform();

    }
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) com.hectorware.utilities.Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
