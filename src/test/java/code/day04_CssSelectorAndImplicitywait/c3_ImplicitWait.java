package code.day04_CssSelectorAndImplicitywait;

import code.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class c3_ImplicitWait {
    public static void main(String[] args) {

        //1 open browser
        //2 go to the page http://www.vinexponewyork.com/
        //3 click on the attend button


        WebDriver driver = WebDriverUtil.getDriver("Chrome");
        driver.manage().window().fullscreen();
        driver.get("https://www.vinexponewyork.com/");
        driver.findElement(By.cssSelector("a[href='/attend/']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        //we are giving driver a option to wait until page loaded
        //as soon as your enablement loaded it will move on next step
        //it is not going to wait until 10 sn
        //if this was thread.sleep no matter it will always wait for 10 sn
        //Implicit wait will affect all code block where we use it




    }
}
