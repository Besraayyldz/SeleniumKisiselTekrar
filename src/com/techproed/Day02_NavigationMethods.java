package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\OneDrive\\Belgeler\\Selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");//google gidiyor    gp'd\fljco;g;./\'oklkgrsaasxvn;loiuioyrrewq12uv
        driver.navigate().to("http://amazon.com");//get komutu ile ayni isi yapiyor
        driver.navigate().back();//bir onceki sayfaya doner
        driver.navigate().forward();//geri geldigimiz sayfaya gider
        driver.navigate().refresh();//sayfayi yeniler
    }
}
