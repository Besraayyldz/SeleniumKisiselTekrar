package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day04_LocatorsDeneme02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/asus/OneDrive/Belgeler/Selenium dependencies/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20000 , TimeUnit.MILLISECONDS);

        driver.get("http://amazon.com");
        WebElement countinve = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
        countinve.click();

        WebElement select = driver.findElement(By.xpath("//*[@id=\"dealImage\"]/div/div/div[2]"));
        select.click();

        WebElement select2 = driver.findElement(By.xpath("//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[5]/span/div/div[1]/a/div"));
        select2.click();
        driver.navigate().forward();
        driver.quit();
    }
}
