package code.day04_CssSelectorAndImplicitywait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_CssSelector {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //Css Selector Locator
        //first way
        //driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("bug spray");
        //second way
        //driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("cookie jar ");
        //third way (# means id in css)
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("TV");

        //XPath : //tagname[@attirbute='value]
                  //div[@id='ok'
        //css : tagname[attribute='value']
                 // div[id='ok'

        // CSS ID -----> tagname#value
        // CSS CLASS ----> tagname.value




    }
}
