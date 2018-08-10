package emagPage;

import help.HelperMethodes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartShopPage {
    WebDriver driver;

    public HelperMethodes functions = new HelperMethodes(driver);

    @FindBy (how = How.XPATH,using = "//select[@class='select2 pickup-option-select select2-hidden-accessible']")
    private WebElement allOptionsButton;
    @FindBy (how = How.XPATH, using = "//select[@class='select2 delivery-location-select select2-hidden-accessible']")
    private WebElement selectButton;
    @FindBy (how = How.XPATH,using = "//button[@class='gui-btn gui-btn-escape btn-add-address with-icon']")
    private WebElement billButton;
    @FindBy (how = How.XPATH, using = "//input[@name='name']")
    private WebElement nameBox;
    @FindBy (how = How.ID, using = "phone")
    private WebElement phoneBox;
    @FindBy (how = How.XPATH, using = "//input[@name='street_address']")
    private WebElement adressBox;
    @FindBy (how= How.XPATH, using = "//button[@class='gui-btn gui-btn-loader']")
    private WebElement saveButton;
    @FindBy (how=How.ID, using = "paymentRadiocard")
    private WebElement paymentsButton;
    @FindBy (how = How.XPATH, using = "//input[@name='user[phone]']")
    private WebElement mobilephoneBox;
    @FindBy (how=How.XPATH, using = "//button[@type='submit']")
    private  WebElement submitButton;


    public CartShopPage(WebDriver driver)
    {
        {
            this.driver=driver;
            PageFactory.initElements(driver,this);
        }
    }

    // Click on All Options.

    public CartShopPage clickAllOptions ()
    {
        functions.selectByValue(allOptionsButton, "pickup-point");
        allOptionsButton.click();
        return this;
    }

    // Click on Selected Showroom.

    public CartShopPage clickSelectShowroom()
    {
        functions.selectByValue(selectButton,"5412e183-99c1-11e6-8a27-001a4a1f12fa");
        selectButton.click();
        return this;
    }

    //Click on Bill Button.

    public CartShopPage clikOnBillButton()
    {
        billButton.click();
        return this;
    }

    //Fill name Box.

    public CartShopPage fillnameBox(String name)
    {
        nameBox.sendKeys(name);
        return this;

    }

    //Fill phone Box.

    public CartShopPage fillphoneBox(String number)
    {
        phoneBox.sendKeys(number);
        return this;
    }

    //Fill Address Box

    public CartShopPage filladdressBox(String name, String number)
    {
        adressBox.sendKeys(name,number);
        return this;
    }

    //Click on Save Button.

    public CartShopPage clickOnSaveButton ()
    {
        saveButton.click();
        return this;
    }

    //Click on Payments Button.

    public CartShopPage clickOnPaymentsButton()
    {
        paymentsButton.click();
        return this;
    }

    //Fill mobile Phone box.

    public CartShopPage fillMobilePhoneBox(String number)
    {
        mobilephoneBox.sendKeys(number);
        return this;
    }

    //Go to Final Page.

    public FinalPage goToFinalPage()
    {
        functions.scrollDownMore(driver);
        submitButton.click();
        return new FinalPage(driver);
    }



}
