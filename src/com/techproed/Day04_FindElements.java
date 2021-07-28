package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_FindElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/asus/OneDrive/Belgeler/Selenium dependencies/drives/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
//        if-else, for-foreach, methodlar, nesne olusturma, arrays

        webDriver.get("http://a.testaddressbook.com");
        List<WebElement>  listem =  webDriver.findElements(By.tagName("a"));
//        for(WebElement w : listem){
//            System.out.println(w.getText());
//        }

        System.out.println(listem.get(1).getText());
//        listem.get(1);//birinci siradakini alir
//        getText(); yazisini alir
    }
}
