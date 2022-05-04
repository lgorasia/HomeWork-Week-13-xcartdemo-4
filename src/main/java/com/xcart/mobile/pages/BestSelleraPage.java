package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSelleraPage extends Utility {

    By sortByFieldForBestSeller= By.xpath("//span[contains(text(),'Sort by:')]");
    By zToAFieldForBestSeller = By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-bestsellers.one-sidebar.sidebar-first.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.clearfix div.flex-container div.column:nth-child(3) div.section div.list-container:nth-child(2) div.block.block-block.block-bestsellers:nth-child(4) div.content div.items-list.items-list-products div.list-header:nth-child(3) div.sort-box ul.display-sort.sort-crit.grid-list:nth-child(2) li.list-type-grid:nth-child(5) > a:nth-child(1)");
    By highToLowFieldForBestSeller =By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-bestsellers.one-sidebar.sidebar-first.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.clearfix div.flex-container div.column:nth-child(3) div.section div.list-container:nth-child(2) div.block.block-block.block-bestsellers:nth-child(4) div.content div.items-list.items-list-products div.list-header:nth-child(3) div.sort-box ul.display-sort.sort-crit.grid-list:nth-child(2) li.list-type-grid:nth-child(3) > a:nth-child(1)");
    By ratesFieldForBestSeller = By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-bestsellers.one-sidebar.sidebar-first.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.clearfix div.flex-container div.column:nth-child(3) div.section div.list-container:nth-child(2) div.block.block-block.block-bestsellers:nth-child(4) div.content div.items-list.items-list-products div.list-header:nth-child(3) div.sort-box ul.display-sort.sort-crit.grid-list:nth-child(2) li.list-type-grid:nth-child(6) > a:nth-child(1)");
    By bestSellerTextField= By.xpath("//h1[@id='page-title']");
    By aToZFieldForBestSeller=By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-bestsellers.one-sidebar.sidebar-first.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.clearfix div.flex-container div.column:nth-child(3) div.section div.list-container:nth-child(2) div.block.block-block.block-bestsellers:nth-child(4) div.content div.items-list.items-list-products div.list-header:nth-child(3) div.sort-box ul.display-sort.sort-crit.grid-list:nth-child(2) li.list-type-grid:nth-child(4) > a:nth-child(1)");
    By addToBasketField = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]");
    By productIsAddedToCartMessageField = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By clickOnXButtonField =By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-bestsellers.one-sidebar.sidebar-first.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div:nth-child(1) div.status-messages-wrapper:nth-child(2) div.status-messages-wrapper2 div:nth-child(1) > a.close:nth-child(1)");
    By clickOnCartField =By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[4]");
    By clickOnViewCartField= By.xpath("//span[contains(text(),'View cart')]");
    By vinylIdozField = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']");


    public void sortByBestSeller(){
        mouseHoverToElement(sortByFieldForBestSeller);
    }
    public void clickOnZToAForBestseller(){
        mouseHoverToElementAndClick(zToAFieldForBestSeller);
    }
    public void clickOnHighToLowForbestSeller(){
        mouseHoverToElementAndClick(highToLowFieldForBestSeller);
    }
    public void clickOnRatesForBestSeller(){
        mouseHoverToElementAndClick(ratesFieldForBestSeller);
    }
    public String bestSellerText(){
        return getTextFromElement(bestSellerTextField);
    }
    public void clickOnAToZForBestSeller(){
        mouseHoverToElementAndClick(aToZFieldForBestSeller);
    }
    public void clickOnAddToCart(){
        mouseHoverToElementAndClick(addToBasketField);
    }
    public String productIsAddedToCartMessage(){
        return getTextFromElement(productIsAddedToCartMessageField);
    }
    public void clickOnXButton(){
        clickOnElement(clickOnXButtonField);
    }
    public void clickOnCart(){
        clickOnElement(clickOnCartField);
    }
    public void clickOnViewCart(){
        clickOnElement(clickOnViewCartField);
    }
    public void clickOnVinylIdoz(){
        mouseHoverToElementAndClick(vinylIdozField);

    }
}
