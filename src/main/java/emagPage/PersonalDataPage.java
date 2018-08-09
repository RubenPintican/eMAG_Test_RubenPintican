package emagPage;

import help.HelperMethodes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalDataPage {
    WebDriver driver;
    public HelperMethodes functions = new HelperMethodes(driver);


    @FindBy (how=How.XPATH, using = "//label[@for='accountGenderMale']")
    private WebElement genderButton;
    @FindBy (how=How.XPATH, using = ".//*[@name='nickname']")
    private WebElement nicknameBox;
    @FindBy (how=How.XPATH, using = ".//*[@name='telephone1']")
    private WebElement mobilephoneBox;
    @FindBy (how=How.XPATH, using = "//select[@name='ziua']")
    private WebElement dayButton;
    @FindBy (how=How.XPATH, using = "//select[@name='luna']")
    private WebElement monthButton;
    @FindBy (how=How.XPATH, using = "//select[@name='anul']")
    private WebElement yearButton;
    @FindBy (how=How.ID, using = "nivel_educatie")
    private WebElement educationButton;


    public PersonalDataPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public PersonalDataPage clickGenderButton ()
    {
        genderButton.click();
        return this;
    }

    public PersonalDataPage fillAccountDataPage(String nickname ,String mobilephone)
    {
        nicknameBox.sendKeys(nickname);
        mobilephoneBox.sendKeys(mobilephone);
        return this;
    }

    public PersonalDataPage clickDayButton ()
    {
        functions.selectByValue(dayButton,"21");
        dayButton.click();
        return this;

    }

    public PersonalDataPage clickMonthButton()
    {
        functions.selectByValue(monthButton,"2");
        monthButton.click();
        return this;
    }

    public PersonalDataPage clickYearButton()
    {
        functions.selectByValue(yearButton,"1995");
        yearButton.click();
        return this;
    }

    public PersonalDataPage clickeducationButton()
    {
        functions.selectByValue(educationButton,"4");
        educationButton.click();
        return this;
    }


}
