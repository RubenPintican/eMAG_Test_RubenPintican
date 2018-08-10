package emagPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FinalPage {
    WebDriver driver;

    @FindBy (how = How.XPATH, using = "//h1[@class='cart emg-left']")
    private WebElement commandMessage;

    public FinalPage (WebDriver driver)
    {
        {
            this.driver=driver;
            PageFactory.initElements(driver,this);
        }
    }

    //Validate Command Process.

    public FinalPage validateCommandProcess(String message)
    {
        String actualvalue = commandMessage.getText();
        if (!(actualvalue.isEmpty()))
        {
            if (actualvalue.contains(message))
            {
                System.out.println("Toate datele au fost introduse corect, putem plasa comanda!");
            }
        }
        return this;
    }
}
