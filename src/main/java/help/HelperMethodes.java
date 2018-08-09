package help;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperMethodes {
    WebDriver driver;

    //Constructor
    public HelperMethodes(WebDriver driver)
    {
        this.driver=driver;
    }

    //Methods  (motode generale)!!

    //Click on random WebElement

    public void clickWebElement(WebElement element)
    {
        element.click();
    }

    //Validate a page displayed

    public void validatePage(String expected, WebDriver driver)
    {
        if (!expected.isEmpty())
        {
            String actual=driver.getTitle();
        }
    }

    //Fill WebElement with a value

    public void fillWebElement (WebElement element, String value)
    {
        element.sendKeys(value);
    }

    //Select by Text

    public void selectByText(WebElement element, String text )
    {
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(text);

    }

    //Select by Value

    public void selectByValue (WebElement element, String value)
    {
        Select dropDown = new Select(element);
        dropDown.selectByValue(value);
    }

    public void selectValueDropDownByText(WebElement element,String option)
    {
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(option);

    }

    //Hover a WebElement

    public void hoverWebElement ( WebElement element, WebDriver driver)
    {
        Actions action=new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    //WaitExplicit in a WebElement

    public void waitExplicit ( WebElement element, WebDriver driver)
    {
        new WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(element));
    }
    public void scrollDownMore(WebDriver driver)
    {
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
    }
}