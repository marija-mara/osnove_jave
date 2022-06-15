package SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Dohvatiti sliku prvog proizvoda koristeci Absolute XPath-a
public class Zadatak1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url="https://cms.demo.katalon.com/";
        driver.navigate().to(url);
        driver
                .findElement(By.xpath("/html/body/div/div/div[2]/div/main/div[2]/ul/li/div/a/img"));
        driver.quit();
    }
}
