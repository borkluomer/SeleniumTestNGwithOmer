package code.day05_RadioButtonAndTestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class c5_TestNGExample2 {
    @BeforeClass
    public void setupClass(){ System.out.println("Before class is Running ");}

    @AfterClass
    public void setupAfterClass(){ System.out.println("After class is Running ");}

    @BeforeMethod
    public void setup(){ System.out.println("Before Method is running ");}

    @AfterMethod
    public void closing (){ System.out.println("After Method is Running ");}

    //TESTCASE 1 is depends on TESTCASE 3 if TESTCASE 3 is failed , TESTCASE will be IGNORED
    @Test(priority = 3,dependsOnMethods = "TESTCASE3")
    public void TESTCASE1(){
        System.out.println("TESTCASE 1 IS RUNNING ! ");
    }
    @Test(priority = 1)
    public void TESTCASE3(){
        System.out.println("TESTCASE 3 IS RUNNING ! ");
        String actualCar= "Chevrolet";
        String expectedCar = "Tesla";
        Assert.assertEquals(expectedCar,actualCar);
        //if assertion is failed next line of code will not execute
        System.out.println("Assertion for Cars is passed ");
    }
    @Test(priority = 2)
    public void TESTCASE2(){
        System.out.println("TESTCASE 2 IS RUNNING ! ");
        String country1 = "USA";
        String country2 = "USA";
        Assert.assertEquals(country1,country2);
    }
    //its not going to run this test case when you say IGNORE
    @Ignore
    @Test
    public void TESTCASE4(){
        System.out.println("TEST CASE 4 IS RUNNING ");
    }



}
