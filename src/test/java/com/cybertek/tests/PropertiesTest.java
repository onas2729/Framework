package com.cybertek.tests;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test
    public void test1(){
        String browser= ConfigurationReader.get("browser");
        System.out.println(browser);
        System.out.println(ConfigurationReader.get("url"));
        System.out.println(ConfigurationReader.get("mybrowser"));


    }
}
