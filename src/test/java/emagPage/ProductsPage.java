package emagPage;

import help.HelperMethodes;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    WebDriver driver;
    HelperMethodes function = new HelperMethodes(driver);


//    @FindBy (how=How.XPATH,using = "//*[@id='restList']/div[@class='list']/div")
//    private List<WebElement> phoneList;
    @FindBy(how = How.XPATH, using = "//a[@title='Telefon mobil Apple iPhone X, 64GB, 4G, Space Grey']")
    private WebElement phoneButton;
    @FindBy(how=How.XPATH, using = "//i[@class='em em-cart_fill gtm_680klw']")
    private WebElement cartButton;
    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary btn-sm btn-block']")
    private WebElement seeCartButton;
    @FindBy (how = How.XPATH, using = "//a[@class='emg-button emg-btn-large emg-btn-full gtm_sn11312018']")
    private WebElement goCartButton;
    @FindBy (how = How.XPATH, using = "//h2[@class='cart-vendor-title']")
    private WebElement verifyProductInCart;


    public ProductsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    // Go to Select Phone.

    public ProductsPage goToSelectPhone()
    {
        function.scrollDownMore(driver);
        phoneButton.click();
        return this;
    }

    // Add to Cart Shop.

    public ProductsPage addToCartShop()
    {
        cartButton.click();
        return this;
    }

    // See Cart Shop.

    public ProductsPage seeCartShop ()
    {
        seeCartButton.click();
        return this;
    }

    public ProductsPage verifyProductInCart()
    {
        Assert.assertTrue(verifyProductInCart.getText().contains("Produse vandute si livrate de eMAG"));
        return this;
    }

    // Go to Cart Shop.

    public CartShopPage goCartShop ()
    {
        goCartButton.click();
        return new CartShopPage(driver);
    }




}
