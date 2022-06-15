package SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak6 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://cms.demo.katalon.com/product/flying-ninja/ ";
        driver.navigate().to("https://cms.demo.katalon.com/product/flying-ninja/ ");

        driver.findElement(By.name("//*[@name='add-to-cart']"));
        driver.findElement(By.className("//*[contains(@class,'add_to_cart_button')]"));
        //hvata formu preko klase u kojoj se nalazi dugme a zatim se spusta do dugmeta
        driver.findElement(By.xpath("//*[contains(@class,'cart')]/button"));
        driver.findElement(By.id("//*[@id='main']//form[contains(@class, 'cart')]/button"));

//        driver.manage().window().maximize();
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.manage().window().minimize();
//
        Thread.sleep(5000);
        driver.quit();
    }
}
