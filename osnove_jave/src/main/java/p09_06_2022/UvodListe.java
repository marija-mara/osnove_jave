package p09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UvodListe {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://s.bootsnipp.com/iframe/oV91g";
        driver.navigate().to(url);
        List<WebElement> pagers= driver.findElements(By.id("//body/div[2]//label"));

        for (int i = 0; i < pagers.size(); i++) {
            pagers.get(i).click();
            Thread.sleep(1000);
        }
        driver.quit();
    }
}
