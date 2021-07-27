package com.techproed;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/asus/OneDrive/Belgeler/Selenium dependencies/drives/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        webDriver.get("http://google.com");
        WebElement aramaKutusu = webDriver.findElement(By.name("q"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();//enter gorevi gorur
        WebElement aramaSonucu = webDriver.findElement(By.id("result-stats"));
        System.out.println(aramaSonucu.getText());
        WebElement alisverisLinki = webDriver.findElement(By.partialLinkText("Alışveriş"));
        alisverisLinki.click();
        webDriver.quit();
    }
}
