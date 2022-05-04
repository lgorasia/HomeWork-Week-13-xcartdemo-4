package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShippingPage extends Utility {
    By shippingField=By.id("page-title");

    public String shippingText(){
        return getTextFromElement(shippingField);
    }
}
