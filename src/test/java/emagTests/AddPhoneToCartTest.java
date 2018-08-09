package emagTests;

import emagPage.*;
import help.BaseTest;
import org.junit.Test;

public class AddPhoneToCartTest extends BaseTest {
    @Test

    public void fourTest ()
    {
        EmagHomePage homePage = new EmagHomePage(driver);
        LoginPage loginPage =new LoginPage(driver);
        SearchPage searchPage=new SearchPage(driver);
        PhonePage phonePage = new PhonePage(driver);
        CartShop cartShop = new CartShop(driver);

        homePage.goEmagHomePage();
        homePage.goLoginPage();
        loginPage.fillEmailField("ruben.pintican@yahoo.com");
        loginPage.clickOnContinueButton();
        loginPage.fillPasswordBox("dinamo2018");
        loginPage.goToHomePage();
        homePage.validateLogInProcess("Salut,Ruben Pintican");
        searchPage.fillSearchBox("Iphone")
                .goToPhonePage();
        phonePage.goToSelectPhone()
                .addToCartShop()
                .seeCartShop()
                .goCartShop();
        cartShop.clickAllOptions()
                .clickSelectShowroom();

    }

}
