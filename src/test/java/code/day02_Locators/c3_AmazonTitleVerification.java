package code.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_AmazonTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        //TASK 2
        // 1- Open Chrome browser
        // 2- Go to google
        // 3- navigate back
        // 4- navigate forward
        // 5- navigate to https://amazon.com
        // 6- verify title contains : smile

        // Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //go to google
        driver.get("https://www.google.com/");
        Thread.sleep(4000);

        //navigate back
        driver.navigate().back();

        //navigate forward
        Thread.sleep(4000);
        driver.navigate().forward();

        // 5- navigate to https://amazon.com
        Thread.sleep(3500);
        driver.navigate().to("https://amazon.com");

        // 6- verify title contains : smile

        String expectedTitle = "Smile";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("it contains smile");
        }else {
            System.out.println("it does not smile");
        }










    }
}
