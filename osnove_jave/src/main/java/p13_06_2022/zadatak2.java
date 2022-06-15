package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;

public class zadatak2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        File slika = new File("src\\main\\resources\\1.png");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = "https://crop-circle.imageonline.co/#circlecropresult";
        driver.get(url);
        driver.manage().window().maximize();

        new Actions(driver)
                .scrollToElement(driver.findElement(By.id("photobutton"))).perform();
        driver.findElement(By.name("file")).sendKeys(slika.getAbsolutePath());

        driver.quit();
    }
}
