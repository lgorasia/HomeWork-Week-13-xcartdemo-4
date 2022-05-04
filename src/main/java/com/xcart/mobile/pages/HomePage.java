package com.xcart.mobile.pages;


import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By shippingField = By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-main.no-sidebars.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.desktop-header.affix-top div.container div.navbar.navbar-inverse.mobile-hidden:nth-child(4) div.collapse.navbar-collapse ul.nav.navbar-nav.top-main-menu li.leaf:nth-child(3) a:nth-child(1) > span:nth-child(1)");
    By newPageField = By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-main.no-sidebars.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.desktop-header.affix-top div.container div.navbar.navbar-inverse.mobile-hidden:nth-child(4) div.collapse.navbar-collapse ul.nav.navbar-nav.top-main-menu li.leaf:nth-child(4) a:nth-child(1) > span:nth-child(1)");
    By comingsoonField = By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-main.no-sidebars.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.desktop-header.affix-top div.container div.navbar.navbar-inverse.mobile-hidden:nth-child(4) div.collapse.navbar-collapse ul.nav.navbar-nav.top-main-menu li.leaf:nth-child(5) a:nth-child(1) > span:nth-child(1)");
    By contactUsField = By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-main.no-sidebars.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.desktop-header.affix-top div.container div.navbar.navbar-inverse.mobile-hidden:nth-child(4) div.collapse.navbar-collapse ul.nav.navbar-nav.top-main-menu li.leaf.last:nth-child(6) a:nth-child(1) > span:nth-child(1)");
    By hotDealField = By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-main.no-sidebars.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.desktop-header.affix-top div.container div.navbar.navbar-inverse.mobile-hidden:nth-child(4) div.collapse.navbar-collapse ul.nav.navbar-nav.top-main-menu li.leaf.has-sub:nth-child(2) > span.primary-title:nth-child(1)");
    By saleField = By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-main.no-sidebars.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.desktop-header.affix-top div.container div.navbar.navbar-inverse.mobile-hidden:nth-child(4) div.collapse.navbar-collapse ul.nav.navbar-nav.top-main-menu li.leaf.has-sub:nth-child(2) ul:nth-child(2) li.leaf:nth-child(1) a:nth-child(1) > span:nth-child(1)");
    By bestSellerField = By.cssSelector("body.area-c.skin-customer.skin-crisp_white-customer.skin-theme_tweaker-customer.unauthorized.target-main.no-sidebars.responsive-desktop:nth-child(2) div.mm-page.mm-slideout:nth-child(4) div.desktop-header.affix-top div.container div.navbar.navbar-inverse.mobile-hidden:nth-child(4) div.collapse.navbar-collapse ul.nav.navbar-nav.top-main-menu li.leaf.has-sub:nth-child(2) ul:nth-child(2) li.leaf:nth-child(2) a:nth-child(1) > span:nth-child(1)");

    public void clickOnShipping(){
        clickOnElement(shippingField);
    }
    public void clickOnNewPage(){
        clickOnElement(newPageField);
    }
    public void clickOnCommingsoon(){
        clickOnElement(comingsoonField);
    }
    public void clickOnContactUs(){
        clickOnElement(contactUsField);
    }
    public void clickOnHotDealField(){
        mouseHoverToElement(hotDealField);
    }
    public void clickOnSaleField(){
        mouseHoverToElementAndClick(saleField);
    }
    public void clickOnBestSeller(){
        mouseHoverToElementAndClick(bestSellerField);
    }

}
