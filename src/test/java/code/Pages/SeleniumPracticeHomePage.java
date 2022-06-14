package code.Pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumPracticeHomePage extends BasePage {

    @FindBy(xpath = "//button[@onclick='timedText()']")
    public WebElement timerButton;

    @FindBy(id = "demo")
    public WebElement DefaultText;

    @FindBy (xpath = "//p[.='WebDriver']")
    public WebElement webDriverText;

    public WebElement getWebDriverText(){
        driverWait.until(ExpectedConditions.visibilityOf(webDriverText));
        return webDriverText;

    }

    public void clickTimerButton(){
        driverWait.until(ExpectedConditions.elementToBeClickable(timerButton)).click();

    }

    public void getDefaultText(){
        System.out.println("Default Text is =" +DefaultText.getText());
    }


}
