package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutSuccessPage extends Utility {
    By thankYouField = By.xpath("//h1[@id='page-title']");

    public String thankYOu(){
        return getTextFromElement(thankYouField);
    }
}
