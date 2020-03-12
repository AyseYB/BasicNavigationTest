package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com, ",
                "https://westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (String eachUrl :urls) {
            driver.get(eachUrl);
            if (eachUrl.contains(driver.getTitle().replace(" ", "").toLowerCase())) {
                System.out.println("Test passed");
                System.out.println("eachUrl = " + eachUrl);
                System.out.println("each Title() = " + driver.getTitle());
            } else {
                System.out.println("test failed");
            }

            driver.quit();
        }
    }
}
