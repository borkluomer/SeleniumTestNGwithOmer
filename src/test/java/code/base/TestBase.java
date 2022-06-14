package code.base;

import code.Utilities.BrowserUtils;
import code.Utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    //test base for code for you re usability
    //use access modifier here

    protected WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closing() throws InterruptedException {
        BrowserUtils.wait(3);
      //  driver.close();
    }

}
