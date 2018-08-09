package emagPage;

import help.HelperMethodes;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {

           WebDriver driver;

           public HelperMethodes functions = new HelperMethodes(driver);


    @FindBy(how = How.ID, using = "my_account")
    private WebElement myAccountButton;
    @FindBy (how = How.XPATH, using = "//div[@class='ph-dropdown-inner']/p/strong")
    private WebElement loginmessage;
    @FindBy (how = How.XPATH, using = "//a[@class='back-button']")
    private WebElement backButton;


    //constructor (initializam driver)
    public EmagHomePage (WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    // metoda
    public EmagHomePage goEmagHomePage()
    {
        String actualTitle = driver.getTitle();
        String expectedTitle = "eMAG.ro - cea mai variata gama de produse";
        if(actualTitle.equals(expectedTitle))
            System.out.println("Title Matched");
        else backButton.click();
        return this;
    }

    public LoginPage goLoginPage() {
        myAccountButton.click();
        return new LoginPage(driver);
    }
    // validate the login process
    public EmagHomePage validateLogInProcess (String message)
    {
        functions.hoverWebElement(myAccountButton,driver);
        String actualvalue = loginmessage.getText();
        if (!(actualvalue.isEmpty()))
        {
            if (actualvalue.contains(message))
            {
                System.out.println("Login with success");
            }
        }
        return this;

    }



}
