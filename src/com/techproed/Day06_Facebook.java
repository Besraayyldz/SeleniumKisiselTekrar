package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\OneDrive\\Belgeler\\Selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        driver.get("http://facebook.com");

        WebElement eMail = driver.findElement(By.id("email"));
        eMail.sendKeys("testTechproed@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test1234!");

//        password.submit();

        WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));
        logIn.click();

        //burada java 3000 milisaniye(3 saniye) bekleyecek
//        Thread.sleep(3000); yazip try/catc'e ceviriyoruz
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String url = driver.getCurrentUrl();
        System.out.println(url);

        if(url.contains("facebook.com/login/")){

            System.out.println("giris basarisiz");
        }else
            System.out.println("giris basarili");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();


    }
}
