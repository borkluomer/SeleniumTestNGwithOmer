package code.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverUtil {

    //create an cheapFlightsUtil takes browser type create a connection browser and selenium
        public static WebDriver getDriver(String browser){
            if(browser.equalsIgnoreCase("chrome")){
                //Chrome browser needs to be set up
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            }else if (browser.equalsIgnoreCase("Safari")){
                WebDriverManager.safaridriver().setup();
                return new SafariDriver();

            }else{
                System.out.println("Browser does not Exist! ");
                System.out.println("Check the browser name! ");
                System.out.println("Browser : " +browser);
                return null;
            }
        }



}
