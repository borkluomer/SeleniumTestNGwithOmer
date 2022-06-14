package code.day12_POM_explicityWait;

import code.Pages.SmartBearLoginPage;
import code.Utilities.DriverUtil;
import code.Utilities.PropertiesReadingUtil;
import code.base.TestBase2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c2_Smart_Bear_Negative_Login extends TestBase2 {

    //enter invalid username and password for SmartBear
    //verify you are getting an error message

    SmartBearLoginPage smartBearLoginPage;
    @Test
    public void TC1_Negative_Test_SmartBearLogin(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        smartBearLoginPage = new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("InvalidUserName"),
                PropertiesReadingUtil.getProperties("InvalidPassword"));

        String expectedMessage = "Invalid Login or Password.";
        String actualMessage = smartBearLoginPage.getStatusMessage();

        Assert.assertEquals(expectedMessage,actualMessage,
                "Negative Login Verification has been failed, user was able to Login");

        // we extended our test base with TestBase2 with inheritance method
        // we created page class
        // we stored web elements and methods
        // we created and object in order to call the methods
        // we navigated to url
        // we retrieve credential configuration properties we use it in the methods



    }
}
