package code.day06_DropDownAndSelectClass;

import code.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_GoogleTestNG {

    //let's go to google
    //search macbook
    //verify title is "google"
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

    }

    @Test
    public void TC_GoogleTitleVerification(){
        System.out.println("TC 1 is Running !");
        //verify title is "Google"
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("macbook", Keys.ENTER);
        //verify title contain macbook
        String actualTitle = driver.getTitle();
        String expectedTitle ="macbook";

        boolean b = actualTitle.contains(expectedTitle);
        Assert.assertTrue(b,"Assertion Failed,title does not contain macbook");


    }
    @AfterMethod
    public void closing(){
        driver.quit();
    }


}
