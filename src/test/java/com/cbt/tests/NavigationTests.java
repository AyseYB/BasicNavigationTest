package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {
    chromeDriver();
       // firefoxDriver();
      //  edgeDriver();
       // firefoxTest();
    }
    public static void chromeDriver(){
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title, title3);
        driver.navigate().forward();
        String title4 = driver.getTitle();
        StringUtility.verifyEquals(title2, title4);
        driver.close();
    }
//    Create a separate test method for   each browser
//    public static void chromeTest(){
////        1. Open browser
//        WebDriver driver = BrowserFactory.getDriver("chrome");
////.Go to website https://google.com
//        driver.get("https://google.com");
////        Save the title in a string variable
//        String title = driver.getTitle();
//        //        Go to https://etsy.com
//        driver.navigate().to("https://etsy.com");
////        . Save the title in a string variable
//        String title2 = driver.getTitle();
////        Navigate back to previous page
//        driver.navigate().back();
//        String title3 =driver.getTitle();
////        Verify that title is same is in step 3
//        StringUtility.verifyEquals(title, title3);
//        driver.navigate().forward();
//        String title4 = driver.getTitle();
////        Verify that title is same is in step 5
//        StringUtility.verifyEquals(title2, title4);
//        driver.close();
  //  }



    //##############################################
    public static void firefoxDriver(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String title = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title, title3);
        driver.navigate().forward();
        String title4 = driver.getTitle();
        StringUtility.verifyEquals(title2, title4);
        driver.quit();
    }



    public static void edgeDriver(){
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String title = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2= driver.getTitle();
        driver.navigate().back();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title, title3);
        driver.navigate().forward();
        String title4 = driver.getTitle();
        StringUtility.verifyEquals(title2,title4);
        driver.quit();
    }

//    public static void firefoxTest(){
//
//        WebDriver driver = BrowserFactory.getDriver("firefox");
//        driver.get("https://google.com");
//        String title= driver.getTitle();
//        driver.navigate().to("https://etsy.com");
//        String title2= driver.getTitle();
//        driver.navigate().back();
//        String title3 = driver.getTitle();
//        StringUtility.verifyEquals(title,title3);
//        driver.navigate().forward();
//        String title4 = driver.getTitle();
//        StringUtility.verifyEquals(title2,title4);
//        driver.close();
//
//    }
}
