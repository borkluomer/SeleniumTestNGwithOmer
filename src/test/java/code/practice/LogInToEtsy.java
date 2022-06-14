package code.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInToEtsy {

    public static void main(String[] args) throws InterruptedException {

        //Second Task: // Go to https://www.etsy.com/
        // Maximize window
        // Verify title doesn't contain "Smile"
        // Verify Current Url


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");
        driver.manage().window().fullscreen();
        Thread.sleep(1500);

        String expectedTitle = "Shop";
        String actualTitle = driver.getTitle();
        String url = "https://www.etsy.com/";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("it contains Shop");
        }else {
            System.out.println("it does not Shop");
        }

        System.out.println("Verify current URL :" +actualTitle);
        driver.get(url);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


    }
}
