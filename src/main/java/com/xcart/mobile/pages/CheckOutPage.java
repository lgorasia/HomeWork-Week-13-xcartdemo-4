package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By logInToYourAccoutTextField = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailField = By.xpath("//input[@id='email']");
    By continueOnCheckOutPageField = By.xpath("//span[contains(text(),'Continue')]");
    By secureCheckOutField = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]");
    By firstNameField = By.xpath("//input[@id='shippingaddress-firstname']");
    By lastNameField = By.xpath("//input[@id='shippingaddress-lastname']");
    By addressField = By.xpath("//input[@id='shippingaddress-street']");
    //By stateField = By.xpath("//input[@id='shippingaddress-custom-state']");
    By stateField = By.id("shippingaddress-custom-state");
    By createAccoutForLaterUseField = By.id("create_profile");
    By passwordField = By.xpath("//input[@id='password']");
    //By localShippingField = By.id("method128");
    By localShippingField = By.xpath("//input[@id='method128']");
    By paymentMethodField = By.id("pmethod6");
    By verifyTotalField = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[2]/span[1]/span[1]");
    By placeOrderFiedld =By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]");

    public String logInToYourAccout() {
        return getTextFromElement(logInToYourAccoutTextField);
    }

    public void clicEemail(String email) {
        sendTextToElement(emailField, email);

    }

    public void clickOnCheckOutPage() {
        clickOnElement(continueOnCheckOutPageField);
    }

    public String secureCheckOutText() {
        return getTextFromElement(secureCheckOutField);
    }

    public void clickOnFirstName(String name) {
        sendTextToElement(firstNameField, name);
    }

    public void clickOnLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void clickOnAddress(String address) {
        sendTextToElement(addressField, address);
    }

    public void clickOnState(String text) {
clearValue(stateField);
        sendTextToElement(stateField,text);

    }

    public void clickOnAccoutForLater() {
        clickOnElement(createAccoutForLaterUseField);
    }

    public void clickOnPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLocalShipping() {
        mouseHoverToElement(localShippingField);
        clickOnElement(localShippingField);

    }

    public void paymentMethod() {
        mouseHoverToElement(paymentMethodField);
        clickOnElement(paymentMethodField);
    }

    public String totalVerification() {
       return getTextFromElement(verifyTotalField);

    }
    public void placeOrder(){
        clickOnElement(placeOrderFiedld);
    }
}




