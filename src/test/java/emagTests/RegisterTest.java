package emagTests;

import emagPage.EmagHomePage;
import emagPage.LoginPage;
import emagPage.RegisterPage;
import help.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test

    public void FirstTest() {

        EmagHomePage homePage = new EmagHomePage(driver);
        LoginPage loginPage =new LoginPage(driver);
        RegisterPage registerPage=new RegisterPage(driver);

        homePage.goEmagHomePage();
        homePage.goLoginPage();
        loginPage.fillEmailBox("ru.pintican@yahoo.com")
                    .clickOnContinueButton();
        registerPage.fillRegisterPage("Rubenn", "dinamo2018", "dinamo2018")
                    .clickOnAgreeTerms()
                    .clickOnConfirmAgeButton()
                    .clickonContinueButton();

}
}
