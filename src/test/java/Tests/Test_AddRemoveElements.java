package Tests;

import org.example.Utils.AddRemoveElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_AddRemoveElements extends AddRemoveElements {
    private WebDriver driver;
    private AddRemoveElements are;
    private Test_SelectEngine tse;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/hinganm/the-internet_automation/chromedriver");

        // Configurare ChromeOptions pentru a folosi profilul preconfigurat
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=/Users/hinganm/Library/Application Support/Google/Chrome/Profile12");
        options.addArguments("--profile-directory=Profile 12");  // Specifică numele profilului

        // Argumente suplimentare
        options.addArguments("disable-popup-blocking");
        options.addArguments("--no-first-run");
        options.addArguments("--no-default-browser-check");
        options.addArguments("--disable-default-apps");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        are = new AddRemoveElements();
        tse = new Test_SelectEngine();
    }

    @Test
    public void test_navigate_to_page() {
        try {
            Thread.sleep(5000); // 5000 milisecunde = 5 secunde
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get(are.getLink());
        try {
            Thread.sleep(5000); // 5000 milisecunde = 5 secunde
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String title = driver.getTitle();
        assert title.equals("The Internet");


    }




    @Test
    public void test_add_and_delete_multiple_buttons_from_page() {
        WebElement addBtn = driver.findElement(By.cssSelector("button[onclick='addElement()']"));

        addBtn.click();
        //TODO: dupa fiecare click incrementez numarul de butoane adaugate
        WebElement delBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/button"));
        delBtn.click();
        //TODO: fac un for care apasa pe toate butoanele numarate mai sus
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

        // 5 sec intarziere intre toate testele
//        try {
//            Thread.sleep(5000); // 5000 milisecunde = 5 secunde
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
