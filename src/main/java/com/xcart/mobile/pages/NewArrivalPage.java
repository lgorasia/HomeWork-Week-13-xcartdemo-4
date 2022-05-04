package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewArrivalPage extends Utility {
    By newArrivalField=By.id("page-title");

    public String newArrivalText(){
        return getTextFromElement(newArrivalField);
    }
}
