package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = " https://cms.demo.katalon.com/my-account/";
        driver.navigate().to(url);
        driver
                .findElement(By.id("rememberme"))
                .click();
        Thread.sleep(2000);
      //  Select s = new Select(driver.findElement(By.id("gh-cat")));

//        List<WebElement> op = s.getOptions();
//        Random random = new Random();
//        int next = random.nextInt();

        driver.quit();
    }

}
