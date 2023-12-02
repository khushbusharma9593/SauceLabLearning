package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils
{
    public void clickOnRegisterButton()
    {
        clickOnElement(By.linkText("Register"));
    }
    public void verifyUserIsOnLoginPage()
    {
        //Click on log in button by below css locator
        clickOnElement(By.xpath("//a[@class=\"ico-login\"]"));

        //check the URL of login
        Assert.assertTrue(driver.getCurrentUrl().contains("login"),"User is NOT on Log in page");


    }

}
