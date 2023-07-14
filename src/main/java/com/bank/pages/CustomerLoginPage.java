package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By customerTab = By.xpath("//button[contains(text(),'Customer Login')]");
    By searchOption = By.id("userSelect");
    By clickLogIN = By.xpath("//button[contains(text(),'Login')]");
    By verifyLogOut = By.xpath("//button[contains(text(),'Logout')]");
    By clickLogout = By.xpath("//button[contains(text(),'Logout')]");
    By verifyYourName = By.xpath("//label[contains(text(),'Your Name :')]");
    public void setCustomerTab(){
        clickOnElement(customerTab);
    }
    public void setSearchOption(){
           selectByVisibleTextFromDropDown(searchOption,"Harry Potter");
    }
    public void setClickOnHome(){
        clickOnElement(clickLogIN);
    }
    public String setVerifyLogOut(){
        return getTextFromElement(verifyLogOut);
    }
    public void setVerifyLogOut1(){
        clickOnElement(clickLogout);
    }
    public String SetVerifyYourName(){
        return getTextFromElement(verifyYourName);
    }
}
