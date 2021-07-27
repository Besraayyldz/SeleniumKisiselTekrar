package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_LocatorsDeneme02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/asus/OneDrive/Belgeler/Selenium dependencies/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://amazon.com");
        WebElement countinve = driver.findElement(By.xpath("(//button)[5]"));
        countinve.click();
//        eMail.sendKeys("ayyldzbesra@gmail.com");
//        WebElement ileri = driver.findElement(By.className("VfPpkd-vQzf8d"));
//        ileri.click();

    }
}
