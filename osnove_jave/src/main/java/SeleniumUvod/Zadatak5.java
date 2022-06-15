package SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak5 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "http://cms.demo.katalon.com/my-account/";
        driver.navigate().to(url);
        //RELATIVNA X PUTANJA

        driver.findElement(By.xpath("//input[@name='username']"));
        //drugi nacin za pronalazenje istog elementa
        //            //* selektuj sve sa tagom id vrednost username

        driver.findElement(By.xpath("//*[@id='username']"));
        driver.findElement(By.xpath("//*[contains(@class, 'login')]/p[2]/input"));
        driver.findElement(By.xpath("//*[contains(@class,'woocommerce-form-login__rememberme')]"));
        driver.findElement(By.xpath("//button[contains(@value, 'Log in')]"));

        driver.quit();

    }
}
