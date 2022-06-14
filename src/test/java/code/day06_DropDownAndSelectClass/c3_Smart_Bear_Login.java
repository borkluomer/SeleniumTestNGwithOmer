package code.day06_DropDownAndSelectClass;

import code.Utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class c3_Smart_Bear_Login {

        //1- Open a Chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        //3- Enter username --->Tester
        //4- Enter password --->test
        //5- Click "Login" button
        //6- Verify title equals: Web Orders

        @Test
        public void TestNG(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
            driver.manage().window().maximize();

            driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

            driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

            driver.findElement(By.id("ctl00_MainContent_login_button")).click();

            String expectedTitle = "Web Orders";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle,expectedTitle,"Title is not verified...");
        }
        @AfterMethod
    public void closing () throws InterruptedException{
            BrowserUtils.wait(2);
            //driver.close();
        }

    }


