package p09_06_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        ArrayList<String> nizStringova = new ArrayList<>();

        nizStringova.add("https://google.com/");
        nizStringova.add("https://youtube.com/");
        nizStringova.add("https://www.ebay.com/");
        nizStringova.add("https://www.kupujemprodajem.com/");
        //na ekranu ispisuje naslov stranica
        for (int i = 0; i < nizStringova.size(); i++) {
            driver.navigate().to(nizStringova.get(i));
            System.out.println(driver.getTitle());
        }
        driver.quit();
    }
}
