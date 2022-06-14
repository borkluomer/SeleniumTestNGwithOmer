package code.day11_actions;

import code.Utilities.BrowserUtils;
import code.Utilities.DriverUtil;
import code.base.TestBase2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c2_AlertPractice extends TestBase2 {

    /*
         Go to "http://the-internet.herokuapp.com/"
         click JavaScript Alerts
         Click for Js Prompt
         Enter "hello word" text
         Click okay
         Validate your text appearing on the page

     */

    @Test
    public void AlertPractice() throws InterruptedException {
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/");
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //click JavaScript Alerts
        WebElement jsAlertLink= DriverUtil.getDriver().findElement(By.xpath("//a[normalize-space()='JavaScript Alerts']"));
        jsAlertLink.click();
        //Click for Js Prompt
        WebElement clickForJSPrompt = DriverUtil.getDriver().findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        clickForJSPrompt.click();
        Thread.sleep(3000);
        //Enter "hello word" text
        //         Click okay
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        alert.sendKeys("Hello World");
        BrowserUtils.wait(3);
        alert.accept();
        WebElement actualText = DriverUtil.getDriver().findElement(By.id("result"));
        Assert.assertTrue(actualText.getText().contains("Hello World"));










    }






}
