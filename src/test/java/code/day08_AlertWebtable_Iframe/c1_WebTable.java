package code.day08_AlertWebtable_Iframe;

import code.Utilities.BrowserUtils;
import code.Utilities.SmartBearUtils;
import code.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_WebTable {

    //    Smart bear software street verification
    //       1. Open browser and login to Smart bear software
    //       2. Click on View all orders
    //       3. Verify Mark Smith has street as  "9, Maple Valley"

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //1- Open a Chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3.Login
        SmartBearUtils.loginForSmartBear(driver);
    }
    @AfterMethod
    public void closing(){
        BrowserUtils.wait(2);
        driver.close();
    }

    @Test
    public void TC1_VerifyMarkStreetName(){
      //  WebElement markStreet = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/td[6]"));
        //parent to child method
        //  System.out.println("mark street name:" +markStreet.getText());
        WebElement markStreet = driver.findElement(By.xpath("//td[.='770077007700']//..//td[6]"));

        String actualStreet = markStreet.getText();
        String expectedStreet = "9, Maple Valley";

        Assert.assertEquals(actualStreet,expectedStreet,"Verification has failed");

    }



    }




