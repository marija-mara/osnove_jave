package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class zadatak6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("file:///C:/Users/neman/Downloads/Zadatak6.html");

        //preko ifa da li postoji element
        List<WebElement> elements = driver.findElements(By.id("id-0"));
        if (elements.size() > 0) {
            System.out.println("Element postoji");
        } else {
            System.out.println("Ne postoji");
        }

    }

    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return  elementExist;
    }


}
