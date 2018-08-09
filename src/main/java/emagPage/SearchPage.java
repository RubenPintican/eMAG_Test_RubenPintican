package emagPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;

    @FindBy(how = How.ID, using = "searchboxTrigger")
    private WebElement searchBox;
    @FindBy (how = How.XPATH,using = "//button[@class='btn btn-default searchbox-submit-button']")
    private WebElement searchButton;

    //constructor (initializam driver)

    public SearchPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //metoda

    public SearchPage fillSearchBox (String name)
    {
        searchBox.sendKeys(name);
        return this;
    }

    public PhonePage goToPhonePage ()
    {
        searchButton.click();
        return new PhonePage (driver);
    }
}
