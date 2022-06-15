package SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak7 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://cms.demo.katalon.com/cart/";
        driver.navigate().to(url);

        driver.findElement(By.tagName("//a[contains(@class,'remove')]"));
    }
}
