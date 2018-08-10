package emagTests;

import emagPage.EmagHomePage;
import emagPage.LoginPage;
import help.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test

    public void SecondTest(){

        EmagHomePage homePage = new EmagHomePage(driver);
        LoginPage loginPage =new LoginPage(driver);

        homePage.goEmagHomePage();
        homePage.goLoginPage();
        loginPage.fillEmailBox("ruben.pintican@yahoo.com");
        loginPage.clickOnContinueButton();
        loginPage.fillPasswordBox("dinamo2018");
        loginPage.goToHomePage();
        homePage.validateLoginProcess("Salut,Ruben Pintican");

    }
}
