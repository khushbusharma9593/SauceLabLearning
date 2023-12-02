package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BrowserManager
{
    //Create Before and After method for open and close browser
    @BeforeMethod
    public void setUp()
    {
        openBrowser();
    }

    @AfterMethod
   public void tearDown()
    {
       closeBrowser();
    }
}
