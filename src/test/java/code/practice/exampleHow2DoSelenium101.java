package code.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleHow2DoSelenium101 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().fullscreen();
        Thread.sleep(2500);
        driver.get(String.valueOf(By.className("gLFyf gsfi")));


    }
}
