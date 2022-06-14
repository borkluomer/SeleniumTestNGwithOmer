package code.seleniumUdemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

    public static void main(String[] args) {

        //navigation on Chrome

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/"); // campaigning here it will wait till ?
        driver.navigate().to("https://www.rahulshettyacademy.com");
        driver.navigate().back(); // it will take you back to google.com page.
        driver.navigate().forward(); // go back to rahul shetty website again !




    }
}
