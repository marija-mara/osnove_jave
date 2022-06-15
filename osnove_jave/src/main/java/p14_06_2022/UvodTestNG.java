package p14_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class UvodTestNG {
    //pre svih testova
    //pripremiti okruzenje za testiranje
    //before--> sql upit da napravimo sto korisnika, ili da aploadujemo falove
    //ili ako hocemo da podesimo drajver

    private WebDriver driver;
    private String baseUrl="https://google.com";

    @BeforeClass
    public void beforeClas() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //svaka metoda se zove pre svakog tsta u klasi
    //azuriranje profila: 1.azuriraj ifo,2.promeni pasvord---->
    // before metoda (idi u stranicu)log, TESTOVI, izlogujemo se
    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }

    //kada ne bi stavili priority bilo bi po abecedi

    @Test(priority = 10)
    public void googleTitleTest() {
        //za contains ide samo Assert.assertTrue(driver.getTitle().contains("google"),
        // pa poruka koja mora da bude opisnija npr:
        // / je dopuna za base odnosno home stanica
        driver.get(baseUrl+"dopuna na desno");
        driver.get(baseUrl+ "/login");
        Assert.assertEquals(
                driver
                        .getTitle(),
                "Google",
                "[ERROR] page title is not valid.");
        //od ovog trenutka na dole drajver ima 30 cekanje
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String actualSearchType = driver.findElement(By.name("q")).getAttribute("type");
        Assert.assertEquals(
                actualSearchType,
                "text",
                "eror Input search is not type text.");

        //actual=rez koji je na stanici
    }

    //ostaviti prostora za testove izmedju, posto bi moralo da se menja rucno svima
    @Test(priority = 20)
    public void googleUrlTest() {
        if (driver.getCurrentUrl().contains("google.com")) {
            System.out.println("Ok");
        } else {
            System.out.println("nije ok");
        }

    }

    //desava se na posle svakog testa --->
    // ukoliko test fejluje, napravi skin sot
    @AfterMethod
    public void afterMethod() {
        System.out.println("after metoda");
    }

    //na kraju svih testova
    //ukoliko nesto ima u before klas, mora da se ponisti
    @AfterClass
    public void aftereClass() {
        driver.quit();
    }


    //test se prekida ukoliko se desi neki exepsn

}
