package emagPage;

import help.HelperMethodes;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    public HelperMethodes functions = new HelperMethodes(driver);

    @FindBy(how = How.ID, using = "my_account")
    private WebElement myaccountButton;
    @FindBy(how = How.ID, using = "email")
    private WebElement emailTextBox;
    @FindBy (how = How.XPATH, using = "//button[@class='gui-btn auth-btn-primary auth-submit']")
    private WebElement continueButton;
    @FindBy(how=How.ID , using = "password")
    private WebElement passwordBox;
    @FindBy (how=How.XPATH,using = "//*[@class='gui-btn auth-btn-primary auth-submit']")
    private WebElement continue2Button;
    @FindBy (how = How.XPATH, using = "//div[@class='gui-form-control -wide -error']")
    private WebElement verifyPassword;



    //constructor
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public LoginPage goToLoginPage() {
        myaccountButton.click();
        return new LoginPage(driver);
    }

    // Methodes
    // Fill Email Box.
    public LoginPage fillEmailBox(String email)
    {
        emailTextBox.sendKeys(email);
        return this;
    }

    //Click on Continue Button.

    public LoginPage clickOnContinueButton()
    {
        continueButton.click();
        return this;
    }

    // Wait Explicit.

    public void waitExplicit ( WebElement passwordBox, WebDriver driver)
    {
        new WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(passwordBox));
    }

    // Fill password Box.

    public LoginPage fillPasswordBox(String password)
    {
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='"+password+"';",passwordBox);
       return this;
    }

    public LoginPage verifyPassword ()
    {
        Assert.assertTrue(verifyPassword.getText().contains("Ai introdus gresit parola sau adresa de email. Te rog completeaza din nou."));
        return this;
    }

    // Click on Continue2 Button.

    public EmagHomePage goToHomePage ()
    {
        continue2Button.click();
        return new EmagHomePage(driver);
    }



}
