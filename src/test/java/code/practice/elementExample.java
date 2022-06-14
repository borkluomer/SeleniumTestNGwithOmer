package code.practice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class elementExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Chad Andrew");
        Thread.sleep(1500);

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        Thread.sleep(2000);
        email.sendKeys("borkluomer@yahoo.com");

        WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[placeHolder='Current Address']"));
        currentAddress.click();
        Thread.sleep(2000);
        currentAddress.sendKeys("Panama City Beach, FL");

        WebElement permanentAddress= driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        Thread.sleep(1500);
        permanentAddress.sendKeys("ADANA, TURKEY");

        WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
        submitButton.click();

        WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
        String name1 = nameText.getText();
        System.out.println(name1);

        WebElement emailText = driver.findElement(By.xpath("//div/p[@id='email']"));
        String email1 = emailText.getText();
        System.out.println(email1);

        WebElement currentAddress1 = driver.findElement(By.xpath("//div/p[@id='currentAddress']"));
        String address1 = currentAddress1.getText();
        System.out.println(address1);

        WebElement pAddress = driver.findElement(By.xpath("//div/p[@id='permanentAddress']"));
        String address2 = pAddress.getText();
        System.out.println(address2);


















    }
}
