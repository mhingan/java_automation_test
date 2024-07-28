package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_SelectEngine {

    @Test
    public void setEngine(){
        WebDriver driver = new ChromeDriver();
        WebElement el = driver.findElement(By.xpath("//*[@id=\"button\"]/div[1]"));
        el.click();


        WebElement el2 = driver.findElement(By.xpath("//*[@id=\"actionButton\"]/div"));
        el2.click();
    }
}
