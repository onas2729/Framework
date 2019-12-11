package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.get(), this);

    }
    // FindBys Method
    //    @FindBys({
    //            @FindBy(id="prependedInput")
    //            @FindBy(name="prependedInput") })
    @FindBy(name="USER_LOGIN")
    private WebElement userName;

    @FindBy(name="USER_PASSWORD")
    private WebElement password;

    @FindBy(className="login-btn")
    private WebElement submit;

    public void login (){
        // this is marufjon method (if you need to this information you can check main project)
        // public void login (String userNameStr, String passwordStr)

        userName.clear();
        password.clear();

        userName.sendKeys(ConfigurationReader.get("user_name"));
        password.sendKeys(ConfigurationReader.get("password"));
        submit.click();
    }
}
