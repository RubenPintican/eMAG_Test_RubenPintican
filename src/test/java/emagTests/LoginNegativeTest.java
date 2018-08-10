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
        loginPage.fillEmailBox("ruben.pintican@yahoo.com");
        loginPage.clickOnContinueButton();
        loginPage.fillPasswordBox("fcsb2018");
        loginPage.goToHomePage();
        homePage.validateLogInProcess("Ruben Pintican");



    }
}
