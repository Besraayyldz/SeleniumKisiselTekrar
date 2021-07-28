package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\OneDrive\\Belgeler\\Selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");

        String googleTitle = driver.getTitle();
        System.out.println(googleTitle);

        driver.get("http://youtube");
        String youtubeTitle = driver.getTitle();
        System.out.println(youtubeTitle);

        String youtubeUrl = driver.getCurrentUrl();
        System.out.println(youtubeUrl);

        driver.navigate().back();

        String googleUrl = driver.getCurrentUrl();
        System.out.println(googleUrl);

        driver.quit();
    }
}
