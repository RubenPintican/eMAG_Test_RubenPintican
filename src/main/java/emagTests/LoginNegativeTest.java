package emagTests;

import emagPage.EmagHomePage;
import emagPage.LoginPage;
import help.BaseTest;
import org.junit.Test;

public class LoginNegativeTest extends BaseTest {
    @Test

    public void fiveTest(){

        EmagHomePage homePage = new EmagHomePage(driver);
        LoginPage loginPage =new LoginPage(driver);

        homePage.goEmagHomePage();
        homePage.goLoginPage();
        loginPage.fillEmailField("ruben.pintican@yahoo.com");
        loginPage.clickOnContinueButton();
        loginPage.fillPasswordBox("dinamo2017");
        loginPage.goToHomePage();
        homePage.validateLogInProcess("Ruben Pintican");



    }
}
