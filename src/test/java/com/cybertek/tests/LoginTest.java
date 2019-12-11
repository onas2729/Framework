package com.cybertek.tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test (description= "Verify login")
    public void test1(){
        LoginPage loginPage=new LoginPage();

        loginPage.login();
    }
}
