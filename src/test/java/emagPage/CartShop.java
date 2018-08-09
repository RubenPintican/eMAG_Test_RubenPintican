package emagPage;

import help.HelperMethodes;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartShop {
    WebDriver driver;

    public HelperMethodes functions = new HelperMethodes(driver);

    @FindBy (how = How.XPATH,using = "//select[@class='select2 pickup-option-select select2-hidden-accessible']")
    private WebElement allOptionsButton;
    @FindBy (how = How.XPATH, using = "//select[@class='select2 delivery-location-select select2-hidden-accessible']")
    private WebElement selectButton;

    public CartShop (WebDriver driver)
    {
        {
            this.driver=driver;
            PageFactory.initElements(driver,this);
        }
    }

    public CartShop clickAllOptions ()
    {
        functions.selectByValue(allOptionsButton, "pickup-point");
        allOptionsButton.click();
        return this;
    }

    public CartShop clickSelectShowroom()
    {
        functions.selectByValue(selectButton,"5412e183-99c1-11e6-8a27-001a4a1f12fa");
        selectButton.click();
        return this;
    }



}
