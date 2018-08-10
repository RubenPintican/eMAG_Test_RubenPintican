package emagTests;

import emagPage.*;
import help.BaseTest;
import org.junit.Test;

public class AddPhoneToCartNegativeTest extends BaseTest {
    @Test
    public void sixTest()

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
        homePage.validateLogInProcess("Salut,Ruben Pintican");
        searchPage.fillSearchBox("Iphone")
                .goToProductsPage();
        productsPage.goToSelectPhone()
                .addToCartShop()
                .seeCartShop()
                .goCartShop();
        cartShopPage.clickAllOptions()
                .clickSelectShowroom()
//                .clikOnBillButton()
                .fillnameBox("Pop Ionescu")
                .fillphoneBox("0758456789")
                .filladdressBox("Siret", "12")
                .clickOnSaveButton()
                .fillMobilePhoneBox("")
                .goToFinalPage();
        finalPage.validateCommandProcess("");


    }
}
