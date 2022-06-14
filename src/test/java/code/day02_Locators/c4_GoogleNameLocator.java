package code.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_GoogleNameLocator {
    public static void main(String[] args) throws InterruptedException {

        // 1-open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- lets go to google
        driver.get("https://www.google.com/");

        // 3- write an orange in seach box
        //we find google search box element using name locator
        WebElement searchBox = driver.findElement(By.name("q")); //name 'q'
        searchBox.sendKeys("orange"); //the name here you enter
        Thread.sleep(4000); //waiting for 4 seconds

        // 4-click google search button
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        // 5-verify title
        // expected : title should start with "orange" word
        String expectedTitle = "orange";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("title verification has passed");
        }else{
            System.out.println("title verification has failed");
        }
        System.out.println("actual title is " +actualTitle);











    }
}
