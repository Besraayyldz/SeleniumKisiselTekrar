package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {


        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\OneDrive\\Belgeler\\Selenium dependencies\\drives\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("http://google.com");
            driver.navigate().to("http://youtube.com");//get ile ayni isi gorur
            driver.navigate().back();//onceki sayfaya geri dondu
            driver.navigate().forward();//sonraki sayfaya geri gitti
            driver.navigate().refresh();//yeniledi
            driver.quit();//driveri kapatti
        }
}
