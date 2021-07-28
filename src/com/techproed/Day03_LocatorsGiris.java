package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/asus/OneDrive/Belgeler/Selenium dependencies/drives/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(3000 , TimeUnit.MILLISECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("http://a.testaddressbook.com");//sayfata gider
        WebElement signIn = webDriver.findElement(By.id("sign-in"));
        signIn.click();

        WebElement eMail = webDriver.findElement(By.id("session_email"));
        eMail.sendKeys("testtechproed@gmail.com");

        WebElement password = webDriver.findElement(By.id("session_password"));
        password.sendKeys("Test1234!");

        WebElement signInOl = webDriver.findElement(By.name("commit"));
        signInOl.click();

        String baslik = webDriver.getTitle();
        if(baslik.contains("Adress Book")){
            System.out.println("giris basarili");
        }else{
            System.out.println("giris basarisiz");
        }
    }
}
