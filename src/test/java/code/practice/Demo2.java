package code.practice;

import code.Utilities.BrowserUtils;
import code.Utilities.SmartBearUtils;
import code.Utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Demo2 {
    //1-  Open a Chrome browser
    //2-  Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3-  Login
    //4.  Click on Order
    //5.  Select familyAlbum from product, set quantity to 5
    //6.  Click to "Calculate" button
    //7.  Fill address Info with JavaFaker
    //8.  Click on "visa" radio button
    //9.  Generate card number using JavaFaker
    //10. Enter expiration date
    //11. Click on "Process"
    //12. Verify success message "New order has been successfully
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        SmartBearUtils.loginForSmartBear(driver);
    }
    @Test
    public void TC1(){
        WebElement order= driver.findElement(By.xpath("//a[.='Order']"));
        order.click();

        Select dropDown=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        dropDown.selectByVisibleText("FamilyAlbum");

        WebElement quantity= driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys("5");

        WebElement calculate = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculate.click();

        WebElement CustomerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement street = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement city = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zipCode = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));


        Faker faker = new Faker();
        CustomerName.sendKeys(faker.name().fullName());
        street.sendKeys(faker.address().streetName());
        city.sendKeys(faker.address().cityName());
        state.sendKeys(faker.address().state());
        zipCode.sendKeys(faker.address().zipCode().replaceAll("-",""));

        WebElement visaButton= driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaButton.click();

        WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        WebElement expireDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expireDate.sendKeys("01/30");

        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();

        BrowserUtils.wait(3);

        WebElement message = driver.findElement(By.xpath("//strong"));
        Assert.assertEquals(message.getText(),("New order has been successfully added."));














    }
}
