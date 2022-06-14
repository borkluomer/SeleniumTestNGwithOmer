package code.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_Locators {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        //find the search box with id locator
        // is always unique
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Sneakers");
        ////to find byXpath locator //tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
}
