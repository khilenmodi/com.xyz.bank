package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By clickOnOpenAccount = By.xpath("//button[normalize-space()='Open Account']");

    By searchByName = By.id("userSelect");
    By selectCurrency = By.id("currency");
    By clickOnProcess = By.xpath("//button[contains(text(),'Process')]");

    public void setClickOnOpenAccount(){
        clickOnElement(clickOnOpenAccount);
    }
    public void setSearchByName(){
        selectByVisibleTextFromDropDown(searchByName,"Harry Potter");
    }
    public void setSelectCurrency(){
        selectByVisibleTextFromDropDown(selectCurrency,"Pound");
    }
    public void setClickOnProcess(){
        clickOnElement(clickOnProcess);
    }

}