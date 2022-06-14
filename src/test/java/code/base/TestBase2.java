package code.base;

import code.Utilities.BrowserUtils;
import code.Utilities.DriverUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase2 {
    //when we do an abstract class
    //hiding a class, but you can have the functions
    //abstraction example

    @BeforeMethod
    public void setUp(){
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void closing(){
        BrowserUtils.wait(5);
        DriverUtil.closeDriver();

    }



}
