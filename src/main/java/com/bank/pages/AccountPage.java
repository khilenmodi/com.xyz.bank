package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By clickOnDeposit = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[2]");
    By amountToBeDeposited = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");

    By clickDeposit = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");

    By verifyTextDepositSuccessful = By.xpath("//span[contains(text(),'Deposit Successful')]");

    By clickWithdraw = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[3]");
    By amountToBeWithdrawn = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    By clickOnWithdraw = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");

    By transactionSuccessful = By.xpath("//span[contains(text(),'Transaction successful')]");
    public void setClickOnDeposit() {
        clickOnElement(clickOnDeposit);
    }

    public void setAmountToBeDeposited(int value) {
        clearTextToElement(amountToBeDeposited);
        sendTextToElement(amountToBeDeposited, "value");
    }

    public void setClickDeposit() {
        clickOnElement(clickDeposit);
    }

    public String setVerifyTextDepositSuccessFul() {
        return getTextFromElement(verifyTextDepositSuccessful);
    }

    public void setClickWithdraw() {
        clickOnElement(clickWithdraw);
    }

    public void setAmountToBeWithdrawn(int value) {
        clearTextToElement(amountToBeWithdrawn);
        sendTextToElement(amountToBeWithdrawn, "value");
    }
    public void setClickOnWithdraw(){
        clickOnElement(clickOnWithdraw);
    }

    public String setTransactionSuccessful(){
        return getTextFromElement(transactionSuccessful);
    }
}