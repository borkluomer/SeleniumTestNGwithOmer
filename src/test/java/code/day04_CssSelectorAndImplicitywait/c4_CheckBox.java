package code.day04_CssSelectorAndImplicitywait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class c4_CheckBox {
    public static void main(String[] args) throws InterruptedException {

        //1. Open Chrome browser
        //2. Go to https://demo.guru99.com/test/radio.html
        //3. Verify checkbox1 is not selected
        //4. Click to checkbox2
        //5. Verify checkbox2 is selected

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //2. Go to https://demo.guru99.com/test/radio.html
        driver.get("https://demo.guru99.com/test/radio.html");

        //3. Verify checkbox1 is not selected
        WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));

        if (!checkBox1.isSelected()){
            System.out.println("Checkbox1 is not Selected ");

        }else{
            System.out.println("Checkbox1 is Selected, verification has been Failed! ");
        }

        //4. Click to checkbox2
        WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
        checkbox2.click();

        //5. Verify checkbox2 is selected
        if (checkbox2.isSelected()){
            System.out.println("Checkbox2 is Selected ");
        }else {
            System.out.println("Checkbox2 is not Selected,verification has been failed! ");
        }
        Thread.sleep(3500);
        driver.quit();








    }
}
