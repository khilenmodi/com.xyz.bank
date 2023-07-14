package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    By clickOnAddCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");

    public void setClickOnAddCustomerTab(){
        clickOnElement(clickOnAddCustomerTab);
    }

}
