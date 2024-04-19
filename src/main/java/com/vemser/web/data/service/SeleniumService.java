package com.vemser.web.data.service;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumService {
    public static ChromeOptions options = new ChromeOptions();
    public static WebDriver driver;
    public static WebDriverWait wait;

    public void initBrowser(String url) {
        String driverPath = "driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 30);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void tearDownBrowser() {
        driver.close();
    }

    public void closeAdsByGoogle(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    }
}
