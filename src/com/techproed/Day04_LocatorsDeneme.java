package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day04_LocatorsDeneme {
    public static void main(String[] args) {
//        google'a git
//        searchbox'a youtube
//        youtube sayfasina gidelim
//        trentlerdeki ilk bastaki vidyoyu oynatalim
//        googel geri gidelim
//        yenileyelim
//        kapatalim

        System.setProperty("webdriver.chrome.driver", "C:/Users/asus/OneDrive/Belgeler/Selenium dependencies/drives/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");
        WebElement searcBox = webDriver.findElement(By.name("q"));
        searcBox.sendKeys("youtube");
        searcBox.submit();

        WebElement searchBox = webDriver.findElement(By.tagName("h3"));
        searchBox.click();

        WebElement explore = webDriver.findElement(By.partialLinkText("Explore"));
        explore.click();

        WebElement explore1 = webDriver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[3]"));
        explore1.click();

        WebElement skipEd = webDriver.findElement(By.id("ad-text:7"));
        skipEd.click();

        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.navigate().back();
        webDriver.quit();


    }
}
