package code.day12_POM_explicityWait;

import code.Pages.SmartBearLoginPage;
import code.Utilities.DriverUtil;
import code.Utilities.PropertiesReadingUtil;
import code.base.TestBase2;
import org.testng.annotations.Test;

public class c1_SmartBearPomExample extends TestBase2 {


    @Test
    public void TC1_SmartBearPositiveVerification(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
                PropertiesReadingUtil.getProperties("SmartBear_password"));

    }


}
