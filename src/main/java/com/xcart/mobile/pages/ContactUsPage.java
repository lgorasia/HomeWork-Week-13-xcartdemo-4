package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUsPage extends Utility {
    By contactUsField=By.id("page-title");

    public String contactUsText(){
        return getTextFromElement(contactUsField);
    }
}
