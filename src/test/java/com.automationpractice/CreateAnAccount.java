package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.SignInPage;

import java.util.concurrent.TimeUnit;

public class CreateAnAccount {

    WebDriver driver;
    String baseUrl = "http://automationpractice.com/";

    @BeforeMethod
    public void setUp() {
        driver = driver("chrome");
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }
        public WebDriver driver(String driver) {
            if (driver == "ff") {
                 System.setProperty("webdriver.chrome.driver",
                         "C:\\Data\\Temp\\GradleOne\\src\\main\\resources\\Drivers\\chromedriver.exe");
                return new ChromeDriver();
            } else if (driver == "chrome") {
                System.setProperty("webdriver.chrome.driver",
                        "C:\\Data\\Temp\\GradleOne\\src\\main\\resources\\Drivers\\chromedriver.exe");
                return new ChromeDriver();
            } else {
                 System.setProperty("webdriver.chrome.driver",
                         "C:\\Data\\Temp\\GradleOne\\src\\main\\resources\\Drivers\\chromedriver.exe");
                return new ChromeDriver();
            }
        }

    @Test
    public void createAnAccount() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Data\\Temp\\GradleOne\\src\\main\\resources\\Drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://automationpractice.com/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new SignInPage(driver).clickSignInHeaderButton();
    }

}
