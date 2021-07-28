package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_ifElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\OneDrive\\Belgeler\\Selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        String amazonTitle =  driver.getTitle();

        if(amazonTitle.contains("Car")){//amazonTitle "Car" kelimesin iceriyorsa
            System.out.println("Car kelimesi geciyor " +amazonTitle);
        }else{
            System.out.println("Car kelimesi gecmiyor " +amazonTitle);//amazonTitle "Car" kelimesin icerimiyorsa
        }
        driver.quit();
    }
}
