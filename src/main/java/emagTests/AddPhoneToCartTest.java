package emagTests;

import emagPage.EmagHomePage;
import emagPage.LoginPage;
import emagPage.PhonePage;
import emagPage.SearchPage;
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
                .goToCartShopping();
    }

}
