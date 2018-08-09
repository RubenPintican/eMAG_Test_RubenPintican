package help;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;

    @Before
    public void setup ()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\gecko firefox\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    }

