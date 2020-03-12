package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {

        List<String> urls= Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        List<String> titleList = new ArrayList<>();
        List<Boolean> isStartsWith= new ArrayList<>();
//        3.Open chrome browser
//        4.Visit all the websitesfrom
//        step 3and verify that they all have the same title.
//        5.Verify that all URLsof all pages start with http://practice.cybertekschool.com.
//        6.Close the browser at the end of the test.

          for (String eachURL : urls){
              driver.get(eachURL);
              titleList.add(driver.getTitle());
             // isStartsWith.add(driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com"));
          }

          for (String eachTitle : titleList ){
              StringUtility.verifyEquals(eachTitle, eachTitle+1);
          }

          for ( String  eachStarts : urls){
              isStartsWith.add(eachStarts.startsWith("http://practice.cybertekschool.com"));
          }
        System.out.println("isStartsWith = " + isStartsWith);

        driver.quit();
    }
}
