package com.cydeo.tests.day2_locators_getText_getAttribute.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankheaderVerification {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        WebElement headerText = driver.findElement(By.className("page-header"));

        //Expected: “Log in to ZeroBank”
        String expectedHeaderText= "Log in to ZeroBank";
        String actualHeaderText= headerText.getText();

        if (expectedHeaderText.equals(actualHeaderText)){
            System.out.println("Header text verification PASSED");
        } else {
            System.out.println("Header text verification FAILED");
        }

        driver.close();






    }
}
