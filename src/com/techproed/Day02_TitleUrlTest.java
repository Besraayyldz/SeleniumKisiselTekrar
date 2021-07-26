package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/asus/OneDrive/Belgeler/Selenium dependencies/drives/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://youtube.com");
        String youtubeTitle = webDriver.getTitle();
        if(youtubeTitle.contains("video")){
            System.out.println("video kelimesini iceriyor " );
        }else{
            System.out.println("video kelimesi icermiyor " +youtubeTitle);
        }
        webDriver.quit();
    }
}
