package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
 WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver1=new ChromeDriver();
        driver1.get("http://amazon.com");




    }

}
