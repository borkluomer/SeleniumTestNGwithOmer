package code.day05_RadioButtonAndTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class c2_TestNG {

    @BeforeClass
    public void setup(){
        System.out.println("Before Method is Running! ");
    }
    @AfterMethod
    public void closing(){
        System.out.println("After Method is Running! ");
    }
    @Test
    public void TC1_test(){
        System.out.println("Test1 is Running! ");
    }
    @Test
    public void TC2_test(){
        System.out.println("Test2 is Running! ");
    }
}
