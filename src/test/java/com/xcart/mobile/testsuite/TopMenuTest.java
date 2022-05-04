package com.xcart.mobile.testsuite;




import com.xcart.mobile.pages.*;
import com.xcart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
HomePage homePage = new HomePage();
ShippingPage shippingPage = new ShippingPage();
NewArrivalPage newArrivalPage = new NewArrivalPage();
ComingSoonPage comingSoonPage = new ComingSoonPage();
ContactUsPage contactUsPage = new ContactUsPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {

        homePage.clickOnShipping();
        Thread.sleep(1000);
        String actualText = shippingPage.shippingText();
        String expectedText = "Shipping";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewPage();
        String actualText1 = newArrivalPage.newArrivalText();
        String expectedText1 = "New arrivals";
        Assert.assertEquals(actualText1,expectedText1);
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        homePage.clickOnCommingsoon();
        String actualText3 = comingSoonPage.comingSoonText();
        String expectedText3 = "Coming soon";
        Assert.assertEquals(actualText3,expectedText3);
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUs();
        String actualText4 = contactUsPage.contactUsText();
        String expectedText4 = "Contact us";
        Assert.assertEquals(actualText4,expectedText4);
    }


       }



