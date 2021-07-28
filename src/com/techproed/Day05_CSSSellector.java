package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_CSSSellector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\OneDrive\\Belgeler\\Selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement email = driver.findElement(By.cssSelector("#session_email"));
        email.sendKeys("testtechproed@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("Test1234!");

        password.submit();//enter gorevi gorur



    }
}
