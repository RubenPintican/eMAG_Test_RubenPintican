package emagTests;

import emagPage.*;
import help.BaseTest;
import org.junit.Test;

public class AddPhoneToCartTest extends BaseTest {
    @Test

    public void FourTest ()
    {
        EmagHomePage homePage = new EmagHomePage(driver);
        LoginPage loginPage =new LoginPage(driver);
        SearchPage searchPage=new SearchPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartShopPage cartShopPage = new CartShopPage(driver);
        FinalPage finalPage = new FinalPage(driver);

        homePage.goEmagHomePage();
        homePage.goLoginPage();
        loginPage.fillEmailBox("ruben.pintican@yahoo.com");
        loginPage.clickOnContinueButton();
        loginPage.fillPasswordBox("dinamo2018");
        loginPage.goToHomePage();
        homePage.validateLoginProcess("Salut,Ruben Pintican");
        searchPage.fillsearchBox("Iphone")
                .goToProductsPage();
        productsPage.goToSelectPhone()
                .addToCartShop()
                .seeCartShop()
                .verifyProductInCart()
                .goCartShop();
        cartShopPage.clickAllOptions()
                .clickSelectShowroom()
                .clikOnBillButton()
                .fillnameBox("Pop Ionescu")
                .fillphoneBox("0758456789")
                .filladdressBox("Oltului", "12")
                .clickOnSaveButton()
                .clickOnPaymentsButton()
                .goToFinalPage();
        finalPage.validateCommandProcess("");


    }

}
