package code.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogIn {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: Facebook title verification
        // Task - 1 //Open Chrome Browser
        // Go to https://www.facebook.com
        // Verify title: Expected: "Facebook - Log In or Sign Up"

        //TASK 1
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().fullscreen();

        String expectedTitle = "Log In";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("it contains Log In");
        }else {
            System.out.println("it does not contain Log in");
        }
        Thread.sleep(3500);
        driver.close();













    }
}
