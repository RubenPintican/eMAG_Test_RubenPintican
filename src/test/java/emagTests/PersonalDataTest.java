package emagTests;

import emagPage.EmagHomePage;
import emagPage.LoginPage;
import emagPage.PersonalDataPage;
import help.BaseTest;
import org.junit.Test;

public class PersonalDataTest extends BaseTest {
    @Test

    public void thirdTest ()
    {
        EmagHomePage homePage = new EmagHomePage(driver);
        LoginPage loginPage =new LoginPage(driver);
        PersonalDataPage dataPage=new PersonalDataPage(driver);

        homePage.goEmagHomePage();
        homePage.goLoginPage();
        loginPage.fillEmailField("ruben.pintican@yahoo.com");
        loginPage.clickOnContinueButton();
        loginPage.fillPasswordBox("dinamo2018");
        loginPage.goToHomePage();
        homePage.validateLogInProcess("Ruben Pintican");
        homePage.goLoginPage();
        dataPage.clickGenderButton()
                .fillAccountDataPage("Ruben","0756317965")
                .clickDayButton()
                .clickMonthButton()
                .clickYearButton()
                .clickeducationButton();





    }
}
