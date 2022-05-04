package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.BestSelleraPage;
import com.xcart.mobile.pages.HomePage;
import com.xcart.mobile.pages.SaleProductPage;
import com.xcart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {
    HomePage homePage = new HomePage();
    SaleProductPage saleProductPage = new SaleProductPage();
    BestSelleraPage bestSelleraPage = new BestSelleraPage();

@Test
    public void verifyBestSellersProductsArrangeByAToZ(){
        homePage.clickOnHotDealField();
        homePage.clickOnSaleField();
        String actualText = saleProductPage.saleText();
        String expectedText = "Sale";
        Assert.assertEquals(actualText,expectedText);

        //arrange by A To Z

        saleProductPage.clickOnSortBy();
        saleProductPage.clickOnAToZForSaleProduct();

    }
    @Test
    public void verifySaleProductsPriceArrangeLowToHigh(){
        homePage.clickOnHotDealField();
        homePage.clickOnSaleField();
        String actualText = saleProductPage.saleText();
        String expectedText = "Sale";
        Assert.assertEquals(actualText,expectedText);

        //arrange by price low to high

        saleProductPage.clickOnSortBy();
        saleProductPage.clickOnLowToHighForSaleProduct();

    }
    @Test
    public void verifySaleProductsArrangeByRates(){
        homePage.clickOnHotDealField();
        homePage.clickOnSaleField();
        String actualText = saleProductPage.saleText();
        String expectedText = "Sale";
        Assert.assertEquals(actualText,expectedText);

        //arrange by rates

        saleProductPage.clickOnSortBy();
        saleProductPage.clickOnRateForSaleProduct();

    }
    @Test
    public void verifyBestSellersProductsArrangeByZToA(){
        homePage.clickOnHotDealField();
        homePage.clickOnBestSeller();
        String actualText = bestSelleraPage.bestSellerText();
        String expectedText = "Bestsellers";
        Assert.assertEquals(actualText,expectedText);

        //arrange by Z to A

        bestSelleraPage.sortByBestSeller();
        bestSelleraPage.clickOnZToAForBestseller();

    }
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow(){
        homePage.clickOnHotDealField();
        homePage.clickOnBestSeller();
        String actualText = bestSelleraPage.bestSellerText();
        String expectedText = "Bestsellers";
        Assert.assertEquals(actualText,expectedText);

        //arrange by high to low

        bestSelleraPage.sortByBestSeller();
        bestSelleraPage.clickOnHighToLowForbestSeller();

    }
    @Test
    public void verifyBestSellersProductsArrangeByRates(){
        homePage.clickOnHotDealField();
        homePage.clickOnBestSeller();
        String actualText = bestSelleraPage.bestSellerText();
        String expectedText = "Bestsellers";
        Assert.assertEquals(actualText,expectedText);

        //arrange by rates

       bestSelleraPage.sortByBestSeller();
       bestSelleraPage.clickOnRatesForBestSeller();
    }


    }

