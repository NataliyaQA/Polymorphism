package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTestAbstract {
        public WebDriver driver = new ChromeDriver();

        @BeforeMethod
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://automationpractice.com/");
        }

        @AfterMethod
        public void tearDown() {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.quit();
        }
    }

