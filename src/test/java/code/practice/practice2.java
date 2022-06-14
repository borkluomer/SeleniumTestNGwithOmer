package code.practice;

import code.Utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class practice2 {
        WebDriver driver;
        @BeforeMethod
        public void setup(){

        }
        @Test
        public void TC1_searchForEarrings(){
            //Search for earrings
            //Add some filters to the search
            WebDriverManager.chromedriver().setup();
            driver= WebDriverUtil.getDriver("chrome");
            driver.get("https://www.etsy.com/ca/");


            //First way to sendKeys and hit enter
            WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
            searchBox.sendKeys("earrings");
            WebElement searchButton= driver.findElement(By.xpath("//button[@value='Search']"));
            searchButton.click();
            // second way to sendKeys and hit enter
            // searchBox.sendKeys("earrings"+ Keys.ENTER);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            String expectedUrlContains="earrings";
            String actualUrl=driver.getCurrentUrl();

            Assert.assertTrue(actualUrl.contains(expectedUrlContains));

        }

        @Test
        public void TC_2_addFilters() throws InterruptedException {//Search with filter
            driver.findElement(By.id("search-filter-button")).click();
            Thread.sleep(3000);

            WebElement radioButtonCustom = driver.findElement(By.id("search-filter-min-price-input"));
            Thread.sleep(3000);
            radioButtonCustom.sendKeys("12");

            WebElement applyButton = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
            applyButton.click();


            //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            //WebElement freeShippingCheckBox=driver.findElement(By.xpath("//input[@name='free_shipping']"));
            //freeShippingCheckBox.click();

        }
    }



