package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorLinkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/asus/OneDrive/Belgeler/Selenium dependencies/drives/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        webDriver.get("http://a.testaddressbook.com");
        WebElement signInLink = webDriver.findElement(By.linkText("Sign in"));
        signInLink.click();

        webDriver.get("http://a.testaddressbook.com");
        WebElement home = webDriver.findElement(By.partialLinkText("Home"));
        home.click();

    }
}
