package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
        AccountPage accountPage = new AccountPage();
        AddCustomerPage addCustomerPage = new AddCustomerPage();
        BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
        CustomerLoginPage customerLoginPage = new CustomerLoginPage();
        CustomersPage customerPage = new CustomersPage();
        HomePage homePage = new HomePage();
        OpenAccountPage openAccountPage = new OpenAccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){
        // click On "Bank Manager Login" Tab
        bankManagerLoginPage.setBankManagerLoginPage();
        //	click On "Add Customer" Tab
        customerPage.setClickOnAddCustomerTab();
        //	enter FirstName
        addCustomerPage.setEnterFirstname("khilen");
        //	enter LastName
        addCustomerPage.setEnterLastName("Patel");
        //	enter PostCode
        addCustomerPage.setEnterPostCode("WD25 2DN");
        //	click On "Add Customer" Button
        addCustomerPage.setClickAddCustomer();
        //	popup display
        addCustomerPage.getTextFromAlert();
        //	verify message "Customer added successfully"
        String actualMessage = homePage.getTextFromAlert();
        String expectedMessage = "Customer added successfully with customer id :6";
        Assert.assertEquals(actualMessage,expectedMessage,"Customer added successfully with customer id :6");
        //	click on "ok" button on popup.
        addCustomerPage.acceptAlert();

    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){
        //click On "Bank Manager Login" Tab
        bankManagerLoginPage.setBankManagerLoginPage();
        //	click On "Open Account" Tab
        openAccountPage.setClickOnOpenAccount();
        //	Search customer that created in first test
        openAccountPage.setSearchByName();
        //	Select currency "Pound"
        openAccountPage.setSelectCurrency();
        //	click on "process" button
        openAccountPage.setClickOnProcess();
        //	popup displayed
        openAccountPage.getTextFromAlert();
        //	verify message "Account created successfully"
        String actualMessage = openAccountPage.getTextFromAlert();
        String expectedMessage = "Account created successfully with account Number :1016";
        Assert.assertEquals(actualMessage,expectedMessage,"Account created successfully with account Number :1016");
        //	click on "ok" button on popup.
        openAccountPage.acceptAlert();
    }
    @Test
    public void customerShouldLoginAndLogoutSuceessfully(){
        //click on "Customer Login" Tab
        customerLoginPage.setCustomerTab();
        //	search customer that you created.
        customerLoginPage.setSearchOption();
        //	click on "Login" Button
        customerLoginPage.setClickOnHome();
        //	verify "Logout" Tab displayed.
        String actualText = customerLoginPage.setVerifyLogOut();
        String expectedText = "Logout";
        Assert.assertEquals(actualText,expectedText, "Logout is not displayed");
        //	click on "Logout"
        customerLoginPage.setVerifyLogOut1();
        //	verify "Your Name" text displayed.
        String actualResult = customerLoginPage.SetVerifyYourName();
        String expectedResult = "Your Name";
        Assert.assertEquals(actualResult,expectedResult,"Your Name text is not displayed");
    }

    @Test
    public void customerShouldDepositMoneySuccessfully(){
            // click on "Customer Login" Tab
        customerLoginPage.setCustomerTab();
        //	search customer that you created.
        customerLoginPage.setSearchOption();
        //	click on "Login" Button
        customerLoginPage.setClickOnHome();
        //	click on "Deposit" Tab
        accountPage.setClickOnDeposit();
        //	Enter amount 100
        accountPage.setAmountToBeDeposited(100);
        //	click on "Deposit" Button
        accountPage.setClickDeposit();
        //	verify message "Deposit Successful"
        String actualMessage = accountPage.setVerifyTextDepositSuccessFul();
        String expectedMessage = "Deposit Successful";
        Assert.assertEquals(actualMessage,expectedMessage,"Deposit successful is not displayed");
    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException{
        //click on "Customer Login" Tab
        customerLoginPage.setCustomerTab();
        //	search customer that you created.
        customerLoginPage.setSearchOption();
        //	click on "Login" Button
        customerLoginPage.setClickOnHome();
        //	click on "Withdrawl" Tab
        accountPage.setClickWithdraw();
        Thread.sleep(2000);
        //	Enter amount 50
        accountPage.setAmountToBeWithdrawn(50);
        //	click on "Deposit" Button
        accountPage.setClickOnWithdraw();
        //	verify message "Transaction Successful"
        String actualText = accountPage.setTransactionSuccessful();
        String expectedText = "Transaction Successful";
        Assert.assertEquals(actualText,expectedText,"Transaction Successful is not displayed");
    }

}
