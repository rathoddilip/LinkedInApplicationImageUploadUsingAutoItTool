package com.selenium.autoit.pages;

import com.selenium.autoit.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Dashboard extends BaseClass {
    @FindBy(xpath = "//li-icon[@type='image-icon']//*[local-name()='svg']")
    WebElement photo;
    @FindBy(xpath = "//span[text()='Done']")
    WebElement doneButton;
//    @FindBy(xpath = "//div[@class='ql-editor ql-blank']")
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/p")
    WebElement talkAbout;
    @FindBy(xpath = "//span[text()='Post']")
    WebElement postButton;

    public Dashboard (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setPost() throws InterruptedException {

        Actions actions=new Actions(driver);
        Thread.sleep (2000);
        photo.click ();
        Thread.sleep (2000);
        try {
            Runtime.getRuntime ().exec ("D:\\TestingMaterial\\AutoITSetUp\\UploadAutoITScript\\ImageUploadScript.exe");
            Thread.sleep(2000);
            actions.moveToElement(doneButton).build().perform();
            actions.click(doneButton);
//            doneButton.click();
            Thread.sleep(2000);
            talkAbout.sendKeys("Testing upload image");
            Thread.sleep(1000);
            actions.moveToElement(postButton).build().perform();
            actions.click(postButton);
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}

