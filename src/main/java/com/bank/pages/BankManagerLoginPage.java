package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By bankManagerLoginPage = By.xpath("//button[normalize-space()='Bank Manager Login']");


    public void setBankManagerLoginPage(){
        clickOnElement(bankManagerLoginPage);
    }
}
