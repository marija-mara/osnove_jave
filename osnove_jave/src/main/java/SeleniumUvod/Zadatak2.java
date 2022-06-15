package SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//.Dohvatiti sve linkove (svaki posebno)  iz navigacije koristeci Absolute XPath.
// Linkovi su: cart, my account, checkout,sample page, shop
public class Zadatak2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://cms.demo.katalon.com/";
        driver.navigate().to(url);

        driver.findElement(By.xpath("/html/body/div/div/div/header/nav/div/ul/li[1]/a"));
        driver.findElement(By.xpath("/html/body/div/div/div/header/nav/div/ul/li[2]/a"));
        driver.findElement(By.xpath("/html/body/div/div/div/header/nav/div/ul/li[3]/a"));
        driver.findElement(By.xpath("/html/body/div/div/div/header/nav/div/ul/li[4]/a"));
        driver.findElement(By.xpath("/html/body/div/div/div/header/nav/div/ul/li[5]/a"));

        driver.quit();
    }
}
