package code.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class c5_findElements {
    public static void main(String[] args) throws InterruptedException {

        //1 open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //2. go to apple
        driver.get("http://www.apple.com");

        //lets wait 4 second
        Thread.sleep(4000);
        //click on iphone by using child to parent method
        //click on iphone
        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();

        //4print out thr text of all links
        //print out all the links
        //count of links that doesnt have text
        //count of links that has text
        //a tag has all

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        int linkWithText =0;
        int linkWithoutText=0;

        for (WebElement eachLink: allLinks){
            String elementtoText=eachLink.getText();
            System.out.println(elementtoText);

            if (elementtoText.isEmpty()){
                linkWithoutText++;

            }else{
                linkWithText++;
            }

        }
        System.out.println("link with text = " +linkWithText);
        System.out.println("link without text = " +linkWithoutText);
        System.out.println("all the link size = " +allLinks.size());




    }
}
