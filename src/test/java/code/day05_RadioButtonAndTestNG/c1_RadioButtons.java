package code.day05_RadioButtonAndTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class c1_RadioButtons {
    public static void main(String[] args) {

        // Navigate to https://courses.letskodeit.com/practice
        // click on BMW RADIO button
        //   verify that its selected

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement BmwRadioButton = driver.findElement(By.xpath("//input[@id='bmwradio']"));
        BmwRadioButton.click();

        if (!BmwRadioButton.isSelected()){
            System.out.println("Bmw button is not Selected ");
        }else{
            System.out.println("Bmw button is selected ");
        }

        //Verify that Honda is not selected

        WebElement HondaRadioButton = driver.findElement(By.id("hondaradio"));

        if (!HondaRadioButton.isSelected()){
            System.out.println("Not Selected,The Test has passed ");
        }else{
            System.out.println("Selected, Test has failed ");
        }
        HondaRadioButton.click();










    }
}
