package code.day11_actions;

import code.Utilities.BrowserUtils;
import code.Utilities.DriverUtil;
import code.base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class c3_DropDownExamples extends TestBase2 {

    @Test
    public void TC1(){
        DriverUtil.getDriver().get("https://exchange.sandbox.gemini.com/register/institution");
        WebElement dropDownCountry = DriverUtil.getDriver().findElement(By.xpath("//input[@id='countryDropdown']"));
        dropDownCountry.sendKeys("TURKEY");
        BrowserUtils.wait(3);
        dropDownCountry.sendKeys(Keys.ARROW_DOWN);
        dropDownCountry.sendKeys(Keys.ENTER);



    }


}
