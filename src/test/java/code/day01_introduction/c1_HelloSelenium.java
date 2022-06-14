package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_HelloSelenium {
    public static void main(String[] args) {

        // first step
        // set up chrome driver!
        //driver MANAGER
        WebDriverManager.chromedriver().setup();

        //create a driver instance
        WebDriver driver = new ChromeDriver();

        //navigate to Chrome browser!
        driver.get("https://www.amazon.com/");
        driver.close();




    }
}
