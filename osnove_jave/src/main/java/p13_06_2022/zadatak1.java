package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class zadatak1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //renderovanje---> proces koji iscrtava elemente stranice

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = "https://docs.katalon.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        String theme = driver.findElement(By.tagName("html")).getAttribute("data-theme");

        if (theme.equals("light")) {
            System.out.println("sve ok");
        } else {
            System.out.println("nije ok");
        }

        driver.findElement(By.className("toggleButton_rCf9")).click();
        theme = driver.findElement(By.tagName("html")).getAttribute("data-theme");
        if (theme.equals("dark")) {
            System.out.println("sve ok");
        } else {
            System.out.println("nije ok");
        }
        Actions actions = new Actions(driver);
        actions
                .keyDown(Keys.CONTROL)
                .sendKeys("k")
                .perform();
        String searchType = driver
                .findElement(By.id("docsearch-input"))
                .getAttribute("type");
        if (searchType.equals("search")) {
            System.out.println("sve ok");
        } else {
            System.out.println("nije ok");
        }

        driver.quit();
    }
}
