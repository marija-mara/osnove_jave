package SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = " https://cms.demo.katalon.com/my-account/";
        driver.navigate().to(url);

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/article/div/div/form/p[1]/input"));
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/article/div/div/form/p[2]/input"));

        driver.quit();

    }
}
