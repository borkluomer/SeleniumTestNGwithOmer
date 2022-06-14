package code.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_browserNavigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //to be able to make your screen maximize when google opens up!!!
        driver.manage().window().maximize();
        System.out.println("Title is = " + driver.getTitle());

        //to get url
        System.out.println("Current URL = "+driver.getCurrentUrl() );

        //static wait method in order to wait until page loaded
        Thread.sleep(4000);
        driver.get("https://www.tesla.com/");

        //to get title
        System.out.println("Title is = " + driver.getTitle());

        //to get url
        System.out.println("Current URL = " +driver.getCurrentUrl() );

        //to close browser page
        Thread.sleep(4000);
        driver.close();




    }
}
