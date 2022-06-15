package p14_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KatalonLoginTest {
    private WebDriver driver;
    private String baseUrl = "https://cms.demo.katalon.com";

    @BeforeClass
    public void beforeClas() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }

    @Test(priority = 10)
    public void visitLoginPageFromNavBar() {
        driver.get(baseUrl + "/");
        // //*[CONTAINS(text(), 'MY ACCOUNT')]
        driver.findElement(By.linkText("MY ACCOUNT"))
                .click();
//        Assert.assertEquals(
//                driver.getTitle(),
//                "My account - Katalon Shop",
//                "U naslovu se ne nalazi data rec");

        Assert.assertTrue(
                driver
                        .getCurrentUrl()
                        .contains("/my-account"),
                "Trenutni url nema deo /my-account"
        );
    }

    @Test(priority = 20)
    public void checkInputTypes() {
        driver.get(baseUrl + "/my-account");

        Assert.assertEquals(
                driver
                        .findElement(By.id("username"))
                        .getAttribute("type"),
                "text",
                "poruka");

        Assert.assertEquals(
                driver
                .findElement(By.id("password"))
                .getAttribute("type"), "password", "poruka");

        Assert.assertEquals(
                driver
                .findElement(By.id("rememberme"))
                .getAttribute("type"), "checkbox", "poruka");

        Assert.assertFalse(
                driver
                .findElement(By.id("rememberme"))
                .isSelected(), "poruka");
    }

    @Test
    //test tri 2 nacina da li element postoji i gurnemo to u proveru preko aserta

    @AfterClass
    public void aftereClass() {
        driver.quit();
    }

}
