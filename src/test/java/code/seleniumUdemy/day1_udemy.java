package code.seleniumUdemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1_udemy {
    public static void main(String[] args) throws InterruptedException {

        //1st step
        WebDriverManager.chromedriver().setup();
        //2nd step
        WebDriver driver = new ChromeDriver();
        //3rd step going to the website
        driver.get("http://rahulshettyacademy.com");
        //4th if you're trying to get the title of the page
        driver.getTitle();
        //5th TITLE wrapping it in a print this is if you want to see it printed in the terminal
        System.out.println(driver.getTitle());
        //6 lets get the URL
        System.out.println(driver.getCurrentUrl());
        //7 LETS MAKE IT WAIT FOR A BIT
        Thread.sleep(3500);
        //8 if you want to CLOSE YOUR WINDOW
        driver.close();
        //9 if you want the ALL ASSOCIATED WINDOWS WILL BE CLOSE
        driver.quit();
        ////////////// YOU EITHER USE CLOSE OR QUIT /////////////////


    }
}
