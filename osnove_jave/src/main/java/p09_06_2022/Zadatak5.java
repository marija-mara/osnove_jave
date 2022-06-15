package p09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://s.bootsnipp.com/iframe/z80en";
        driver.navigate().to(url);

        String s = driver.findElement(By.tagName("body")).getText();
        System.out.println(s);
        System.out.println("Columns: ");
        List<WebElement> prvaKolona =
                driver.findElements(By.xpath("//*[@id='lorem']/table/tbody/tr/td[1]"));
        for (int i = 0; i < prvaKolona.size(); i++) {
            String text = prvaKolona.get(i).getText();
            System.out.println(text);
        }
        System.out.println("Row: ");
        List<WebElement> row = driver.findElements(By.xpath("//*[@id='lorem']/table/tbody/tr/td[1]/td"));
        for (int i = 0; i < row.size(); i++) {
            String text = row.get(i).getText();
            System.out.println(text);
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
