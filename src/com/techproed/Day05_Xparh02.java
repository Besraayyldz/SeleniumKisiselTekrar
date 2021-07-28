package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day05_Xparh02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\OneDrive\\Belgeler\\Selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        //        WebElement adressBookTagNane = driver.findElement(By.tagName("h1"));

        WebElement adressBookXpath = driver.findElement(By.xpath("//h1"));
        System.out.println( adressBookXpath.getText());






    }
}
