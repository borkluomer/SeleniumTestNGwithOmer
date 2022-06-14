package code.day11_actions;

import code.Utilities.BrowserUtils;
import code.Utilities.DriverUtil;
import code.base.TestBase2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c4_Action extends TestBase2 {

    //go to http://demo.guru99.com/test/simple_context_menu.html
    //double click to double-click button
    //then accept the alert that pops up

    Actions actions;

    @Test
    public  void TC1_doubleClick(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");

        //double click to double-click button
        WebElement doubleClick= DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));

        actions= new Actions(DriverUtil.getDriver());
        actions.doubleClick(doubleClick).perform();
        //then accept the alert that pops up
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.wait(3);
        alert.accept();


    }
    @Test
    public void TC2_rightClick(){
        //go to http://demo.guru99.com/test/simple_context_menu.html
        //right click to right-click button
        //then click on edit button
        //then accept the alert that pops up

        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");

        //right click to right-click button
        WebElement rightClickButton = DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));
        actions = new Actions(DriverUtil.getDriver());
        actions.contextClick(rightClickButton).perform();

        //then click on edit button
        BrowserUtils.wait(3);
        DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']")).click();
        //there is a pop out again we have to run an Alert
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.wait(3);
        alert.accept();

    }
    @Test
    public void TC3_DragDrop(){
       //http://demo.guru99.com/test/drag_drop.html
        DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
       // creating a drag from here to find the element
        WebElement dragFrom = DriverUtil.getDriver().findElement(By.id("credit2"));
       //creating a drop to here with xpath child to parent method x path
        WebElement dropTo = DriverUtil.getDriver().findElement(By.xpath("//ol[@id='bank']/li"));
       // actions will do the work far as pick and drop
        actions = new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragFrom,dropTo).perform();




    }

    @Test
    public void TC4_DragDrop2(){
        //then drag 5000 to amount section and drop it
        //2 things needs to be done here
        //first specify location of drag
        //second specify location of drop

        DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
        //then drag 5000 to amount section and drop it
        WebElement dragFrom2 = DriverUtil.getDriver().findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
        //first specify location of drag
        WebElement dropTo2 = DriverUtil.getDriver().findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
        //second specify location of drop
        actions = new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragFrom2,dropTo2).perform();

    }


}
