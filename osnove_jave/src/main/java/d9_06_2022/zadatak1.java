package d9_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://s.bootsnipp.com/iframe/WaXlr";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        List<WebElement> rejtingDugmici =
                driver.findElements(By.xpath(
                        "$x(//*[contains(@id,'rating-star-1')])[0]"));

        Scanner s = new Scanner(System.in);
        System.out.println("Izaberite broj zvezdica: ");
        int zvezdice=s.nextInt();
        for (int i = 0; i < rejtingDugmici.size(); i++) {
            rejtingDugmici.get(zvezdice).click();
            Thread.sleep(2000);
        }
        driver.quit();
    }
}
