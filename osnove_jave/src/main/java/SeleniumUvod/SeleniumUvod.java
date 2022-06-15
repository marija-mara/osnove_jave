package SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUvod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://cms.demo.katalon.com/");

        String searchText=" Ninja";
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='s']")).sendKeys();
        Thread.sleep(5000);
        driver.quit();
        driver.findElement(By.name("s"));
        driver.findElement(By.className("search-submit"));

//        driver.get("https://www.ebay.com/"); // nacin 1.
//
//        driver.navigate().to("https://www.ebay.com/");
//        driver.navigate().back();
//        driver.navigate().forward();
//
//
//        driver.manage().window().maximize();
//
//
//        Thread.sleep(2000);
//        WebElement input = driver.findElement(By.xpath("//input[@id='gh-ac']"));
//        input.sendKeys("Shoes"); //id web objekta
//        driver.findElement((By.xpath("//input[@id='gh-ac']")).sendKeys )
//        WebDriver button = driver.findElement(By.xpath("//input[@id='gh-btn']"));
//        button.click();
        //trazimo --- > findElement()
        driver.quit();
    }
}
