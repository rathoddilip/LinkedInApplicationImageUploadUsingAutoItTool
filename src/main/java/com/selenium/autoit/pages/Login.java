package com.selenium.autoit.pages;

import com.selenium.autoit.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {

    String username="deme@gmail.com";
    String password="demo@123";

    @FindBy(xpath = "//input[@id='username']")
    WebElement userId;

    @FindBy (xpath = "//input[@id='password']")
    WebElement userPassword;

    @FindBy (xpath = "//button[normalize-space()='Sign in']")
    WebElement loginButton;


    /* @Description - Called parameterized constructor */

    public Login (WebDriver driver) {
        PageFactory.initElements (driver, this);
    }

    public void loginCredentials() {

        userId.sendKeys (username);
        userPassword.sendKeys (password);
        loginButton.click ();

    }
}
