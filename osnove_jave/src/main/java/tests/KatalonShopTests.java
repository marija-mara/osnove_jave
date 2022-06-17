package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class KatalonShopTests extends BasicTest {
    @Test(priority = 1)
    public void checkLoginInputs() {

    }

    @Test(priority = 2)
    public void indvalidLogin() throws InterruptedException {

    }

    @AfterMethod
    public void afterMethod() {

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
