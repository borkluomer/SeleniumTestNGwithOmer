package code.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_Locators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //to find with Link-text locator
        //driver.findElement(By.linkText("Gmail")).click();

        // find with PartialLinkText locator
        //driver.findElement(By.partialLinkText("Gm")).click();

        //to find by class name
        driver.findElement(By.className("gb_d")).click();




    }
}
