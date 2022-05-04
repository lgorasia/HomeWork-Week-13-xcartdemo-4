package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoonPage extends Utility {
    By comingsoonField=By.id("page-title");

    public String comingSoonText(){
        return getTextFromElement(comingsoonField);
    }
}
