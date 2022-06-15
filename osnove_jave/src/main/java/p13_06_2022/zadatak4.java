package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class zadatak4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://s.bootsnipp.com/iframe/klDWV");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.textToBe(By.id("precent"), "100%"));
        System.out.println("KRAJ");
        // wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("preloader-wrap")));

        // wait.until(ExpectedConditions.attributeToBe(By.className("preloader-wrap"),"style","display: none;"));

        // wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("precent"), "100%"));
        // System.out.println("Stranica ucitana");

        driver.quit();

    }
}
