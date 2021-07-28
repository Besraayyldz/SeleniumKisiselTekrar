package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day04_LocatordTagname {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/asus/OneDrive/Belgeler/Selenium dependencies/drives/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        webDriver.get("http://a.testaddressbook.com");
        WebElement homeLinki = webDriver.findElement(By.tagName("a"));//Home'u bulacak

/*1. yol */
        System.out.println(homeLinki.getText());//webelementin icerdigi yaziziyi alma
/*2. yol */
        String homeYazisi = homeLinki.getText();
        System.out.println(homeYazisi);
//iki yol da ayni sonucu verir
    }
}
