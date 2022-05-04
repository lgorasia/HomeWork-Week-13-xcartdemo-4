package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.*;
import com.xcart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSelleraPage bestSelleraPage = new BestSelleraPage();
    CartPage cartPage = new CartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    CheckOutSuccessPage checkOutSuccessPage = new CheckOutSuccessPage();


    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForApplePhone() throws InterruptedException {
        //select hotdeals-->best seller -->sort by a to z

        homePage.clickOnHotDealField();
        homePage.clickOnBestSeller();
        String actualText=bestSelleraPage.bestSellerText();
        String expectedText = "Bestsellers";
        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);
        bestSelleraPage.sortByBestSeller();
        Thread.sleep(2000);
        bestSelleraPage.clickOnAToZForBestSeller();
       // bestSelleraPage.clickOnZToAForBestseller();
        Thread.sleep(2000);
        bestSelleraPage.clickOnAddToCart();

        //verify message and click on X button

        String actualText1 =bestSelleraPage.productIsAddedToCartMessage();
        String expectedText1 = "Product has been added to your cart";
        Assert.assertEquals(actualText1,expectedText1);
        bestSelleraPage.clickOnXButton();
        Thread.sleep(2000);
        bestSelleraPage.clickOnCart();
        bestSelleraPage.clickOnViewCart();

        //verify total and quantity
        String actualText2 = cartPage.yourCartHasOneItem();
        String expectedText2 = "Your shopping cart - 1 item";
        Assert.assertEquals(actualText2,expectedText2);

        String actualText3 = cartPage.total();
        String expectedText3 = "$299.00";
        Assert.assertEquals(actualText3,expectedText3);

        cartPage.checkOutButton();
//verify log in to your accout -->enter email --> conti
        Thread.sleep(1000);
        String actualText4 = checkOutPage.logInToYourAccout();
        String expectedText4 = "Log in to your account";
        Assert.assertEquals(actualText4,expectedText4);

        checkOutPage.clicEemail("9Abcd_123@gmail.com");
        checkOutPage.clickOnCheckOutPage();
        // enter details and place order

        checkOutPage.clickOnFirstName("Ram");
        Thread.sleep(300);
        checkOutPage.clickOnLastName("Shyam");
        Thread.sleep(300);
        checkOutPage.clickOnAddress("Abc street");
        Thread.sleep(300);
        checkOutPage.clickOnState("London");
        Thread.sleep(3000);
        checkOutPage.clickOnAccoutForLater();
        Thread.sleep(3000);
        checkOutPage.clickOnPassword("123456ABC_125Asd");
        Thread.sleep(2000);
        checkOutPage.clickOnLocalShipping();
       // Thread.sleep(4000);
        checkOutPage.paymentMethod();
        Thread.sleep(3000);

        String actualText5= checkOutPage.totalVerification();
        String expectedText5 = "$311.03";
        Assert.assertEquals(actualText5,expectedText5);
        Thread.sleep(3000);
        checkOutPage.placeOrder();

        //verify thankyou
        String actualText6 = checkOutSuccessPage.thankYOu();
        String expectedText6 = "Thank you for your order";
        Assert.assertEquals(actualText6,expectedText6);




    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        homePage.clickOnHotDealField();
        homePage.clickOnBestSeller();
        String actualText=bestSelleraPage.bestSellerText();
        String expectedText = "Bestsellers";
        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);
        bestSelleraPage.sortByBestSeller();
        Thread.sleep(2000);
        bestSelleraPage.clickOnAToZForBestSeller();
        Thread.sleep(3000);
        bestSelleraPage.clickOnVinylIdoz();
        //verify product added to cart and press X
        String actualText1 =bestSelleraPage.productIsAddedToCartMessage();
        String expectedText1 = "Product has been added to your cart";
        Assert.assertEquals(actualText1,expectedText1);
        bestSelleraPage.clickOnXButton();
        Thread.sleep(2000);
        bestSelleraPage.clickOnCart();
        bestSelleraPage.clickOnViewCart();

        //verify total and quantity
        String actualText2 = cartPage.yourCartHasOneItem();
        String expectedText2 = "Your shopping cart - 1 item";
        Assert.assertEquals(actualText2,expectedText2);
        Thread.sleep(2000);
        //empty Cart
        cartPage.clickOnEmpthCart();
        // get alert message
        String actualText3 =getTextFromAlert();
        String expectedText3 = "Are you sure you want to clear your cart?";
        Assert.assertEquals(actualText3,expectedText3);
        acceptAlert();
        //verify item deleted from cart

        String actualText4 = cartPage.clickOnItemDeletedFromCart();
        String expectedText4 = "Item(s) deleted from your cart";
        Assert.assertEquals(actualText4,expectedText4);

        //verify your cart is empty
Thread.sleep(3000);
        String actualText5 = cartPage.clickOnCartIsEmptyField();
        String expectedText5 = "Your cart is empty";
        Assert.assertEquals(actualText5,expectedText5);




    }
}
