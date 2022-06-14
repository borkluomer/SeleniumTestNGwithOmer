package code.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonEntryExample {
    public static void main(String[] args) throws InterruptedException {

        // Task - 2 //Open Chrome Browser
        // Go to google
        // Navigate back
        // Navigate forward
        // Navigate to https://www.amazon.com
        // Verify title contains : Smile

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.get("https://www.amazon.com/");
        driver.manage().window().fullscreen();
        Thread.sleep(2000);

        String expectedTitle = "Smile";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("it contains smile");
        }else {
            System.out.println("it does not smile");
        }

        driver.close();
    }
}
