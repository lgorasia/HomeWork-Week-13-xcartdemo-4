package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SaleProductPage extends Utility {

    By saleField = By.id("page-title");
    By sortByField= By.xpath("//span[contains(text(),'Sort by:')]");
    By aToZFieldForSaleProduct = By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-sale-products.one-sidebar.sidebar-first.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.clearfix div.flex-container div.column:nth-child(3) div.section div.list-container:nth-child(2) div.block.block-block.block-sale-products:nth-child(3) div.content div.items-list.items-list-products.sale-products div.list-header:nth-child(3) div.sort-box ul.display-sort.sort-crit.grid-list:nth-child(2) li.list-type-grid:nth-child(5) > a:nth-child(1)");
    By lowToHighFieldForSaleProduct =By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-sale-products.one-sidebar.sidebar-first.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.clearfix div.flex-container div.column:nth-child(3) div.section div.list-container:nth-child(2) div.block.block-block.block-sale-products:nth-child(3) div.content div.items-list.items-list-products.sale-products div.list-header:nth-child(3) div.sort-box ul.display-sort.sort-crit.grid-list:nth-child(2) li.list-type-grid:nth-child(3) > a:nth-child(1)");
    By rateFieldForSaleProduct =By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-sale-products.one-sidebar.sidebar-first.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.clearfix div.flex-container div.column:nth-child(3) div.section div.list-container:nth-child(2) div.block.block-block.block-sale-products:nth-child(3) div.content div.items-list.items-list-products.sale-products div.list-header:nth-child(3) div.sort-box ul.display-sort.sort-crit.grid-list:nth-child(2) li.list-type-grid:nth-child(7) > a:nth-child(1)");




public String saleText(){
        return getTextFromElement(saleField);
    }
    public void clickOnSortBy(){
        mouseHoverToElement(sortByField);
    }
    public void clickOnAToZForSaleProduct(){
        mouseHoverToElementAndClick(aToZFieldForSaleProduct);
    }
    public void clickOnLowToHighForSaleProduct(){
        mouseHoverToElementAndClick(lowToHighFieldForSaleProduct);
    }
    public void clickOnRateForSaleProduct(){
        mouseHoverToElementAndClick(rateFieldForSaleProduct);
    }

}
