package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By enterFirstname = By.xpath("//input[@placeholder='First Name']");
    By enterLastName = By.xpath("//input[@placeholder='Last Name']");
    By enterPostCode = By.xpath("//input[@placeholder='Post Code']");
    By clickAddCustomer = By.xpath("//button[@type='submit']");
    public void setEnterFirstname(String name) {
        sendTextToElement(enterFirstname, "name");
    }

    public void setEnterLastName(String lastName) {
        sendTextToElement(enterLastName, "lastName");
    }

    public void setEnterPostCode(String postCode) {
        sendTextToElement(enterPostCode, "postCode");
    }
    public void setClickAddCustomer(){
        clickOnElement(clickAddCustomer);
    }
}
