package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = " https://demoqa.com/login";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        String username = "itbootcamp";
        String password = "ITBootcamp21!";

        driver
                .findElement(By.id("userName"))
                .sendKeys(username);
        //prosledjujem username i password
        driver
                .findElement(By.xpath("//*[@placeholder='Password']"))
                .sendKeys(password);
        //nalazi dugme i klicke na login dugme
        driver
                .findElement(By.xpath("//form[@id='userForm']/div[contains(@class,'buttonWrap')]/div/button"))
                .click();
        //Proverava da li se korisnik ulogovao, tako sto se proverava postojanje dugmeta Logout.
        if (elementExist(driver, By.xpath("//button[text()='Log out']"))) {
            driver
                    //klikce na dugme log out
                    .findElement(By.xpath("//button[text()='Log out']"))
                    .click();
        } else {
            System.out.println("Neuspesan login.");
        }
        Thread.sleep(5000);
    }

    private static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;

    }
}
