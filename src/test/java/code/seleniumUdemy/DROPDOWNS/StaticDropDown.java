package code.seleniumUdemy.DROPDOWNS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        //dropdown with selectTag --DROP-DOWNS ARE ALWAYS STATIC WONT CHANGE!!!!!
        //we are going to handle a dropDown
        //it's going to expect an argument inside ()
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        //one way by index
        Select dropDown = new Select(staticDropdown);
        dropDown.selectByIndex(3); //index number 3 USA
        System.out.println(dropDown.getFirstSelectedOption().getText());
        dropDown.selectByVisibleText("AED");
        System.out.println(dropDown.getFirstSelectedOption().getText());
        dropDown.selectByValue("INR");
        System.out.println(dropDown.getFirstSelectedOption().getText());







    }
}
