package p09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/login";
        String searchText = "Flying Ninja";

        driver.navigate().to(url);
        driver.manage().window().maximize();
        //U delu za pretragu unosi tekst Flying Ninja.
        // Xpath za trazenje ovog elementa treba da bude preko name atributa
        driver
                .findElement(By.name("s"))
                .sendKeys(searchText);
        //Klikce na dugme za pretragu. Dugme sa lupom.
        //Xpath za trazenje ovog elementa treba da bude preko class atributa.
        driver
                .findElement(By.className("search-submit"))
                .click();

        Thread.sleep(5000);

        driver.quit();
    }
}
