package emagPage;

import help.HelperMethodes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PhonePage {
    WebDriver driver;
    HelperMethodes function = new HelperMethodes(driver);


//    @FindBy (how=How.XPATH,using = "//*[@id='restList']/div[@class='list']/div")
//    private List<WebElement> phoneList;
    @FindBy(how = How.XPATH, using = "//a[@title='Telefon mobil Apple iPhone 6, 32GB, Space Gray']")
    private WebElement phoneButton;
    @FindBy(how=How.XPATH, using = "//i[@class='em em-cart_fill gtm_680klw']")
    private WebElement cartButton;

    //constructor

    public PhonePage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //metoda
    public PhonePage goToSelectPhone()
    {
        function.scrollDownMore(driver);
//        phoneList.get(3).click();
        phoneButton.click();
        return this;
    }

    public PhonePage goToCartShopping()
    {
        cartButton.click();
        return this;
    }

}
