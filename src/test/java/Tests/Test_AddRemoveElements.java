package Tests;

import org.example.Utils.AddRemoveElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_AddRemoveElements extends AddRemoveElements {
    private WebDriver driver;
    private AddRemoveElements are;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/hinganm/the-internet_automation/chromedriver");
        driver = new ChromeDriver();
        are = new AddRemoveElements();
    }

    @Test
    public void test1(){
        driver.get(are.getLink());
        String title = driver.getTitle();
        assert title.equals("The Internet");
    }

    @Test
    public void test2(){
        WebElement addBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
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
    }
}
