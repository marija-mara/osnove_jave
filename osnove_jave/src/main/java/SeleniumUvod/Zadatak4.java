package SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = " https://testproject.io/";
        driver.navigate().to(url);
        System.out.println("Google: ");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div/div/div[3]/a[1]"));
        System.out.println("Microsoft: ");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div/div/div[3]/a[2]"));

        driver.quit();

    }
}
