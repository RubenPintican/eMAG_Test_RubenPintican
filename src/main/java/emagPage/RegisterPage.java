package emagPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;

    @FindBy (how =How.ID, using = "r_name")
    private WebElement nameBox;
    @FindBy (how=How.ID, using = "r_password")
    private WebElement passwordBox;
    @FindBy (how=How.ID, using = "r_password_confirmation")
    private WebElement confrmationPasswordBox;
    @FindBy (how=How.ID,using = "agree_terms")
    private WebElement agreeTermsButton;
    @FindBy (how=How.ID,using = "subsribe_newlsetter")
    private WebElement confirmAgeButton;
    @FindBy (how=How.XPATH,using = "//*[@class='gui-btn auth-btn-primary auth-submit']")
    private WebElement continueButton;

    public RegisterPage (WebDriver driver)
    {
    this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //metoda care completeaza campurile de name, password, confirmPassword.

    public RegisterPage fillRegisterPage (String name, String password, String confirmationPassword)
    {
        nameBox.sendKeys(name);
        passwordBox.sendKeys(password);
        confrmationPasswordBox.sendKeys(confirmationPassword);
        return this;
    }

    //metoda care da click pe agreeeTermsButton
    public RegisterPage clickOnAgreeTerms()
    {
        agreeTermsButton.click();
        return this;
    }

    public RegisterPage clickOnConfirmAgeButton()
    {
        confirmAgeButton.click();
        return this;
    }

    public EmagHomePage clickOnContinueButton()
    {
        continueButton.click();
        return new EmagHomePage(driver);
    }








}
