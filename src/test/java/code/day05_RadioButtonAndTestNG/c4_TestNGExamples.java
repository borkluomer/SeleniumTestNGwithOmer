package code.day05_RadioButtonAndTestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class c4_TestNGExamples {

    @BeforeClass
    public void setupClass(){ System.out.println("Before class is Running ");}

    @AfterClass
    public void setupAfterClass(){ System.out.println("After class is Running ");}

    @BeforeMethod
    public void setup(){ System.out.println("Before Method is running ");}

    @AfterMethod
    public void closing (){ System.out.println("After Method is Running ");}

    @Test(priority = 3)
    public void TC1(){
        System.out.println("TEST1 IS RUNNING ");
    }
    @Test(priority = 1)
    public void TC3(){
        System.out.println("TEST3 IS RUNNING ");

        String actualState = "Florida";
        String expectedState = "Louisiana";
        //if assertion is failed next line of code will not execute
        Assert.assertEquals(actualState,expectedState);
    }
    @Test(priority = 2)
    public void TC2(){
        System.out.println("TEST2 IS RUNNING ");

        String name1 = "Chad";
        String name2 = "Chad";
        Assert.assertEquals(name1,name2);
    }

}
