package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("file:///C:/Users/neman/Downloads/Zadatak6.html");
        driver.get("https://www.ebay.com/");

        Select select = new Select(driver.findElement(By.name("_sacat")));
        //iz selekta povlaci sve opcije
        List<WebElement> options = select.getOptions();
        Random random = new Random();
        int randomIndex = random.nextInt(options.size());
        select.selectByIndex(randomIndex);
        Thread.sleep(2000);
        //u opsgu broja elementa niza + Selektuje random kategoriju izabranu u koraku iznad
        randomIndex = random.nextInt(options.size());
        String text = options.get(randomIndex).getText();
        select.selectByVisibleText(text);

        driver.quit();

    }
}
