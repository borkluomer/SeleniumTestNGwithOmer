package code.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearLoginPage extends BasePage {

    //2. @FindBy annotation to locate webElements.
    //    -> Using this FindBy annotation, help us to locate web elements.
    //3. Create methods related web elements

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameBox;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement LoginButton;

    @FindBy(id = "ctl00_MainContent_status" )
    private WebElement statusMessage;
    //encapsulation

    //3. create a method related web elements

    public void loginSmartBear(String userName,String password){
           userNameBox.sendKeys(userName);
           passwordBox.sendKeys(password);
           LoginButton.click();

    }
    public String getStatusMessage(){
        return statusMessage.getText();
        //Invalid Login or Password.
        //this method will return the Text
    }



}
