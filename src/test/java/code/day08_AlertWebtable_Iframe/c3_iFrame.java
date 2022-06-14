package code.day08_AlertWebtable_Iframe;

import code.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_iFrame {

    //1- Open a Chrome browser
    //2- Go to:http://the-internet.herokuapp.com/iframe
    //3- Switching by id or name attribute value.

    WebDriver driver;
    @BeforeMethod
    public void setup(){

        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/iframe");
    }

    @Test
    public void TC1_Iframe(){

        //3- Switching by id or name attribute value.
        //if there is an iFrame first switch to iFrame
        //these are the 3 ways to switch iframe: id/name,index and web element

        driver.switchTo().frame(0);
        WebElement MessageBox = driver.findElement(By.id("tinymce"));
        MessageBox.clear();
        MessageBox.sendKeys("Hello World");

        //in order to return main html use this method
        driver.switchTo().defaultContent();

        //in order to return previous frame use
        //driver.switchTo().parentFrame()
    }
}
