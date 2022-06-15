package p09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/login";
        String username = "itbootcamp";
        String password = "ITBootcamp2021!";

        driver.manage().window().maximize();
        driver.navigate().to(url);

        driver
                .findElement(By.id("userName"))
                .sendKeys(username);
        driver
                .findElement(By.xpath("//*[@placeholder='Password']"))
                .sendKeys(password);
        driver
                .findElement(By.xpath("//form[@id='userForm']/div[contains(@class,'buttonWrap')]/div/button"))
                .click();

        Thread.sleep(5000);

        driver
                .findElement(By.xpath("//button[text()='Log out']"))
                .click();

        driver.quit();

    }
}
