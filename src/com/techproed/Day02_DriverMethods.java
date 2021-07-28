package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\OneDrive\\Belgeler\\Selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");

        driver.navigate().to("http://amazon.com");

        String sayfaTitle = driver.getTitle();//bulundugu sayfanin basligini alir
        System.out.println(sayfaTitle);

        String sayfaUrl = driver.getCurrentUrl();//url'ini alir
        System.out.println(sayfaUrl);

        driver.quit();
    }
}
