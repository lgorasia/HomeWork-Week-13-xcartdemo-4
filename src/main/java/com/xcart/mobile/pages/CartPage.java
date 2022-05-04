package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {

    By yourCartHasOneItemField= By.xpath("//h1[@id='page-title']");
    By totalField= By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-cart.no-sidebars.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.clearfix div.flex-container div.column:nth-child(2) div.section div.list-container:nth-child(2) div.block.block-block:nth-child(3) div.content div.clearfix ul.sums li.subtotal span.cart-subtotal:nth-child(2) span.surcharge > span.surcharge-cell");
    By checkOutButtonField= By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-cart.no-sidebars.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.clearfix div.flex-container div.column:nth-child(2) div.section div.list-container:nth-child(2) div.block.block-block:nth-child(3) div.content div.clearfix div:nth-child(2) ul.totals li.button.main-button > button.btn.regular-button.regular-main-button.checkout");
    By emptyCartField = By.xpath("//a[contains(text(),'Empty your cart')]");
    By itemDeletedFromCartField = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By yourCartIsEmptyField = By.xpath("//h1[@id='page-title']");
    public String yourCartHasOneItem(){
        return getTextFromElement(yourCartHasOneItemField);
    }
    public String total(){
        return getTextFromElement(totalField);
    }
    public void checkOutButton(){
        clickOnElement(checkOutButtonField);
    }
    public void clickOnEmpthCart(){
        clickOnElement(emptyCartField);
    }
    public String clickOnItemDeletedFromCart(){
        return getTextFromElement(itemDeletedFromCartField);
    }
    public String clickOnCartIsEmptyField(){
        return getTextFromElement(yourCartIsEmptyField);
    }

}
