package com.selenium.autoit.test;

import com.selenium.autoit.base.BaseClass;
import com.selenium.autoit.pages.Dashboard;
import com.selenium.autoit.pages.Login;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void loginAndUploadImage() throws InterruptedException {
        Login login= new Login(driver);
        login.loginCredentials();
        Dashboard dashboard=new Dashboard(driver);
        dashboard.setPost();
    }
}
