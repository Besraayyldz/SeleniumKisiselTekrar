package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/asus/OneDrive/Belgeler/Selenium dependencies/drives/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        webDriver.get("http://a.testaddressbook.com");
        WebElement signInLink = webDriver.findElement(By.id("sign-in"));
        signInLink.click();

        WebElement eMail = webDriver.findElement(By.className("form-control"));
        eMail.sendKeys("testtechproed@gmail.com");

        WebElement password = webDriver.findElement(By.id("session_password"));
        password.sendKeys("Test1234!");

    }
}
