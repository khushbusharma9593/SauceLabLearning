package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils
{
    public void verifyUserShouldAbleToLogInSuccessfully()
    {   //enter email id by using typeText method by id locator
        typeText(By.id("Email"), email);
        //Print of email id
        System.out.println(email);

        //enter password by using xpath locator
        typeText(By.xpath("//input[@id=\"Password\"]"), "H@12345");

        //click on login button using xpath locator
        clickOnElement(By.xpath("//button[@class=\"button-1 login-button\"]"));

    }
}
