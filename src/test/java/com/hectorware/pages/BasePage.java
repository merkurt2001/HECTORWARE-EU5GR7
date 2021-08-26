package com.hectorware.pages;


import com.hectorware.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage(){

        PageFactory.initElements(Driver.get(),this);
    }

}
