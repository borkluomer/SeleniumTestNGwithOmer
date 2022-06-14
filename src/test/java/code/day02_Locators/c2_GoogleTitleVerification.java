package code.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_GoogleTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        //TASK
        //1.open Chrome browser
        //2.Go to google
        //3.Verify title : expected : google

        //1.open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //another way to maximize web screen
        driver.manage().window().fullscreen();

        //2.Go to google
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        //3.Verify title : expected : google

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification has passed");
        }else{
            System.out.println("Google title verifacation has failed");
        }

        System.out.println("Actual title is =" +actualTitle);
        driver.close();



    }
}
